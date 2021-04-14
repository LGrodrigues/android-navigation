package com.tit4nium.modulec.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.tit4nium.modulec.R
import com.tit4nium.modulec.databinding.CFragmentBinding

class FragmentC : Fragment() {

    private var binding: CFragmentBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = CFragmentBinding.bind(view)
        this.binding = binding

        binding.fragmentCTitle.text = getString(R.string.fragment_c_title)

    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}