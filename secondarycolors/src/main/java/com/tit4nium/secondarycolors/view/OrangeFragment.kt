package com.tit4nium.secondarycolors.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.tit4nium.secondarycolors.R
import com.tit4nium.secondarycolors.databinding.FragmentOrangeBinding

class OrangeFragment : Fragment() {

    private lateinit var binding: FragmentOrangeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOrangeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
    }

    private fun setupView() = with(binding) {
        fragmentOrangeTitleTextView.text = getString(R.string.fragment_orange_title)
        fragmentOrangeToFragmentPurpleButton.run {
            text = getString(R.string.go_to_fragment_purple_description)
            setOnClickListener {
                findNavController().navigate(R.id.fragment_orange_to_fragment_purple)
            }
        }
    }
}
