package com.tit4nium.green.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.tit4nium.green.R
import com.tit4nium.green.databinding.FragmentNormalGreenBinding

class NormalGreenFragment : Fragment() {

    private lateinit var binding: FragmentNormalGreenBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNormalGreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupVew()
    }

    private fun setupVew() = with(binding) {
        fragmentNormalGreenTitle.text = getString(R.string.fragment_normal_green_title)
        fragmentNormalGreenToFragmentDarkGreenButton.run {
            text = getString(R.string.fragment_normal_green_to_fragment_dark_green_description)
            setOnClickListener { findNavController().navigate(R.id.fragment_normal_green_to_fragment_dark_green) }
        }
    }
}
