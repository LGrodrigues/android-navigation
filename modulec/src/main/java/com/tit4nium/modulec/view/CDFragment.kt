package com.tit4nium.modulec.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tit4nium.modulec.R
import com.tit4nium.modulec.databinding.FragmentCdBinding

class CDFragment : Fragment() {

    private lateinit var binding: FragmentCdBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupVew()
    }

    private fun setupVew() = with(binding) {
        fragmentCdTitle.text = getString(R.string.fragment_cd_title)
        fragmentCdToFragmentCaButton.run {
            text = getString(R.string.fragment_cd_to_fragment_ca_title)
            setOnClickListener {
                findNavController().popBackStack(R.id.fragment_ca, false)
            }
        }
    }
}
