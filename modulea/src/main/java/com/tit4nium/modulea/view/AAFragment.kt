package com.tit4nium.modulea.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tit4nium.modulea.R
import com.tit4nium.modulea.databinding.FragmentAaBinding

class AAFragment : Fragment() {

    private lateinit var binding: FragmentAaBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
    }

    private fun setupView() = with(binding) {
        fragmentAaTitle.text = getText(R.string.fragment_aa_title)
    }
}
