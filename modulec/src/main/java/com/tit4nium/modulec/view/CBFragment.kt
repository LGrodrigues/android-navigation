package com.tit4nium.modulec.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.tit4nium.modulec.R
import com.tit4nium.modulec.databinding.FragmentCaBinding
import com.tit4nium.modulec.databinding.FragmentCbBinding

class CBFragment : Fragment() {

    private lateinit var binding: FragmentCbBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCbBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupVew()
    }

    private fun setupVew() = with(binding) {
        fragmentCbTitle.text = getString(R.string.fragment_cb_title)
        fragmentCbToFragmentCcButton.run {
            text = getString(R.string.fragment_cb_to_fragment_cc_title)
            setOnClickListener { findNavController().navigate(R.id.fragment_cb_to_fragment_cc) }
        }
    }
}