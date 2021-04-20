package com.tit4nium.secondarycolors.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.tit4nium.secondarycolors.R
import com.tit4nium.secondarycolors.databinding.FragmentGreenBinding

class GreenFragment : Fragment() {

    private lateinit var binding: FragmentGreenBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentGreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
    }

    private fun setupView() = with(binding) {
        fragmentGreenTitleTextView.text = getString(R.string.fragment_green_title)
        fragmentGreenDescriptionTextView.text = getString(R.string.back_to_orange_description)
        fragmentGreenToModuleGreenButton.run {
            text = getString(R.string.go_to_module_green_description)
            setOnClickListener { findNavController().navigate(R.id.fragment_green_to_module_green) }
        }
    }
}