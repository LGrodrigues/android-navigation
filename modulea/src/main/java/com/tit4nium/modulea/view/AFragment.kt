package com.tit4nium.modulea.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tit4nium.modulea.R
import com.tit4nium.modulea.databinding.FragmentABinding

class AFragment : Fragment() {

    private lateinit var binding: FragmentABinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentABinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
    }

    private fun setupView() = with(binding) {
        fragmentATitle.text = getText(R.string.fragment_a_title)
        fragmentAToFragmentAaButton.run {
            text = getString(R.string.fragment_a_go_to_aa_)
            setOnClickListener {
                findNavController().navigate(R.id.fragment_a_to_fragment_aa)
            }
        }
    }
}
