package com.tit4nium.modulec.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.tit4nium.modulec.R
import com.tit4nium.modulec.databinding.CaFragmentBinding

class FragmentCA : Fragment() {

    private var binding: CaFragmentBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = CaFragmentBinding.bind(view)
        this.binding = binding

        binding.fragmentCaTitle.text = getString(R.string.fragment_c_title)

    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}