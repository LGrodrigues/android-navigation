    package com.tit4nium.green.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.tit4nium.green.R
import com.tit4nium.green.databinding.FragmentLightGreenBinding

class LightGreenFragment : Fragment() {

    private lateinit var binding: FragmentLightGreenBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLightGreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupVew()
    }

    private fun setupVew() = with(binding) {
        fragmentLightGreenTitle.text = getString(R.string.fragment_light_green_title)
        fragmentLightGreenToFragmentNormalGreenButton.run {
            text = getString(R.string.fragment_light_green_to_fragment_normal_green_description)
            setOnClickListener { findNavController().navigate(R.id.navigation_normal_green_level) }
        }
    }
}