package com.tit4nium.moduleb.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.tit4nium.moduleb.R
import com.tit4nium.moduleb.databinding.BFragmentBinding

class FragmentB : Fragment() {

    private var binding: BFragmentBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = BFragmentBinding.bind(view)
        this.binding = binding

        binding.fragmentBTitle.text = getString(R.string.fragment_b_title)

    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}