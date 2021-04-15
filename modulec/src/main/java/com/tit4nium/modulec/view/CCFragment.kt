package com.tit4nium.modulec.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.tit4nium.modulec.R
import com.tit4nium.modulec.databinding.FragmentCcBinding

class CCFragment : Fragment() {

    private lateinit var binding: FragmentCcBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCcBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupVew()
    }

    private fun setupVew() = with(binding) {
        fragmentCcTitle.text = getString(R.string.fragment_cc_title)
        fragmentCcToFragmentCdButton.run {
            text = getString(R.string.fragment_cc_to_fragment_cd_title)
            setOnClickListener {
                findNavController().navigate(R.id.fragment_cc_to_fragment_cd)
            }
        }
    }
}
