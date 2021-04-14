package com.example.androidnavigation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.androidnavigation.databinding.FragmentBBinding

class FragmentB : Fragment() {

    private var binding: FragmentBBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentBBinding.bind(view)
        this.binding = binding
    }
}