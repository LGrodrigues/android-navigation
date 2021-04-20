package com.tit4nium.modulec.view

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.tit4nium.modulec.R
import com.tit4nium.modulec.databinding.FragmentCBinding

class CFragment : Fragment() {

    private lateinit var binding: FragmentCBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupVew()
    }

    private fun setupVew() = with(binding) {
        fragmentCTitle.text = getString(R.string.fragment_c_title)
        fragmentCToFragmentCaButton.run {
            text = getString(R.string.fragment_c_to_fragment_ca_title)
            setOnClickListener { findNavController().navigate(R.id.fragment_c_to_fragment_ca) }
        }

        fragmentCToFragmentCdDeeplinkButton.run {
            text = getString(R.string.fragment_c_deeplink_to_fragment_cd_title)
            setOnClickListener { findNavController().navigate(Uri.parse("myapp://androidnavigation/modulec_fragment_cd")) }
        }
    }
}