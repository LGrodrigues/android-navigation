package com.tit4nium.modulea.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tit4nium.modulea.R
import com.tit4nium.modulea.databinding.FragmentBlueBinding

class BlueFragment : Fragment() {

    private lateinit var binding: FragmentBlueBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBlueBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
    }

    private fun setupView() = with(binding) {
        fragmentBlueTitle.text = getText(R.string.fragment_blue_title)
        fragmentBlueToFragmentRedButton.run {
            text = getString(R.string.go_to_fragment_red)
            setOnClickListener {
                findNavController().navigate(R.id.fragment_blue_to_fragment_red)
            }
        }
    }
}
