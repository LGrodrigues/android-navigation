package com.tit4nium.primarycolors.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.tit4nium.primarycolors.R
import com.tit4nium.primarycolors.databinding.FragmentRedBinding

class RedFragment : Fragment() {

    private val arguments: RedFragmentArgs by navArgs()
    private lateinit var binding: FragmentRedBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRedBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
    }

    private fun setupView() = with(binding) {
        fragmentRedTitle.text = getText(R.string.fragment_red_title)
        fragmentRedToFragmentYellowButton.run {
            text = getString(R.string.go_to_fragment_yellow)
            setOnClickListener { findNavController().navigate(R.id.fragment_red_to_fragment_yellow) }
        }
        fragmentRedArgumentsTextView.text =
            getString(R.string.fragment_red_argument_formatter, arguments.value)
    }
}
