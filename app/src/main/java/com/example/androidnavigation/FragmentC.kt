package com.example.androidnavigation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.androidnavigation.databinding.FragmentCBinding

class FragmentC : Fragment() {

    //private val arguments: FragmentCArgs by navArgs()
    private var binding: FragmentCBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentCBinding.bind(view)
        this.binding = binding

        //binding.fragmentCText.text = arguments.categoryId

    }
}
