package com.example.androidnavigation.helper

import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.viewbinding.ViewBinding
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

inline fun <reified T : ViewBinding> AppCompatActivity.viewBinding(noinline initializer: (LayoutInflater) -> T) =
    ViewBindingPropertyDelegate(this, initializer)

class ViewBindingPropertyDelegate<T : ViewBinding>(
    private val activity: AppCompatActivity,
    private val initializer: (LayoutInflater) -> T
) : ReadOnlyProperty<AppCompatActivity, T>, LifecycleObserver {

    private var _value: T? = null

    init {
        activity.lifecycle.addObserver(this)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        if (_value == null) {
            _value = initializer(activity.layoutInflater)
        }
        activity.setContentView(_value?.root)
        activity.lifecycle.removeObserver(this)
    }

    override fun getValue(thisRef: AppCompatActivity, property: KProperty<*>): T {
        if (_value == null) {

            // This must be on the main thread only
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw IllegalThreadStateException("This cannot be called from other threads. It should be on the main thread only.")
            }

            _value = initializer(thisRef.layoutInflater)
        }
        return _value!!
    }
}

inline fun <reified T : ViewBinding> Fragment.viewBinding(noinline bindFunction: (View) -> T) =
    FragmentBinding(bindFunction)

class FragmentBinding<T : ViewBinding>(private val bindFunction: (View) -> T) :
    ReadOnlyProperty<Fragment, T>, LifecycleObserver {

    private var binding: T? = null
    private var isObserving = false

    // Should be called between onCreateView and onDestroyView
    override fun getValue(thisRef: Fragment, property: KProperty<*>): T {
        observeFragmentOnDestroy(thisRef)
        if (binding != null) return binding as T
        return bindFunction(thisRef.requireView()).also { binding = it }
    }

    private fun observeFragmentOnDestroy(fragment: Fragment) {
        if (!isObserving) {
            isObserving = true
            fragment.viewLifecycleOwner.lifecycle.addObserver(this)
        }
    }
}