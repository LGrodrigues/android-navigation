package com.tit4nium.green.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tit4nium.green.R
import com.tit4nium.green.databinding.FragmentDarkGreenBinding

class DarkGreenFragment : Fragment() {

    private lateinit var binding: FragmentDarkGreenBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDarkGreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupVew()
    }

    private fun setupVew() = with(binding) {
        fragmentDarkGreenTitle.text = getString(R.string.fragment_dark_green_title)
        /*fragmentCbToFragmentCcButton.run {
            text = getString(R.string.fragment_cb_to_fragment_cc_title)
            setOnClickListener { findNavController().navigate(R.id.fragment_cb_to_fragment_cc) }
        }*/
    }
}
