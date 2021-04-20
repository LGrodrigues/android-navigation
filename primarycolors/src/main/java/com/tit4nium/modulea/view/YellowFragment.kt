package com.tit4nium.modulea.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tit4nium.modulea.R
import com.tit4nium.modulea.databinding.FragmentYellowBinding

class YellowFragment : Fragment() {

    private lateinit var binding: FragmentYellowBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentYellowBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
    }

    private fun setupView() = with(binding) {
        fragmentYellowTitle.text = getText(R.string.fragment_yellow_title)
    }
}
