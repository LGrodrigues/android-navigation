package com.tit4nium.modulea.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.tit4nium.modulea.R
import com.tit4nium.modulea.databinding.AaFragmentBinding

class FragmentAA: Fragment() {

    private var binding: AaFragmentBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = AaFragmentBinding.bind(view)
        this.binding = binding

        binding.fragmentAaTitle.text = getText(R.string.fragment_aa_title)
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}