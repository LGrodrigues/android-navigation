package com.tit4nium.moduleb.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.tit4nium.moduleb.R
import com.tit4nium.moduleb.databinding.FragmentAbBinding

class BAFragment : Fragment() {

    private lateinit var binding: FragmentAbBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAbBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
    }

    private fun setupView() = with(binding){
        fragmentBaTitle.text = getString(R.string.fragment_ba_title)
        fragmentBaToModuleC.run {
            text = getString(R.string.fragment_b_to_module_c_title)
            setOnClickListener { findNavController().navigate(R.id.fragment_ba_to_module_c) }
        }
    }
}
