package com.tit4nium.moduleb.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.tit4nium.moduleb.R
import com.tit4nium.moduleb.databinding.FragmentBBinding

class BFragment : Fragment() {

    private lateinit var binding: FragmentBBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
    }

    private fun setupView() = with(binding) {
        fragmentBTitle.text = getString(R.string.fragment_b_title)
        fragmentBToFragmentBaButton.run {
            text = getString(R.string.fragment_b_to_fragment_ba_title)
            setOnClickListener {
                findNavController().navigate(R.id.fragment_b_to_fragment_ba)
            }
        }
    }
}
