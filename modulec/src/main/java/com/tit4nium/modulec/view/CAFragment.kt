package com.tit4nium.modulec.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tit4nium.modulec.R
import com.tit4nium.modulec.databinding.FragmentCaBinding

class CAFragment : Fragment() {

    private lateinit var binding: FragmentCaBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupVew()
    }

    private fun setupVew() = with(binding) {
        fragmentCaTitle.text = getString(R.string.fragment_ca_title)
    }
}
