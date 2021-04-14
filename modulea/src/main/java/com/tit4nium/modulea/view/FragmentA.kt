package com.tit4nium.modulea.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.tit4nium.modulea.R
import com.tit4nium.modulea.databinding.AFragmentBinding

class FragmentA : Fragment() {

    private var binding: AFragmentBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = AFragmentBinding.bind(view)
        this.binding = binding

        binding.fragmentATitle.text = getText(R.string.fragment_a_title)

    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}