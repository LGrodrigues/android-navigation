package com.tit4nium.moduleb.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.tit4nium.moduleb.R
import com.tit4nium.moduleb.databinding.AbFragmentBinding

class FragmentBA: Fragment() {

    private var binding: AbFragmentBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = AbFragmentBinding.bind(view)
        this.binding = binding

        binding.fragmentBaTitle.text = getString(R.string.fragment_ba_title)
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}