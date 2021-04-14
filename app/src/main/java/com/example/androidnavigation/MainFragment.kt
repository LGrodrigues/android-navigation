package com.example.androidnavigation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.androidnavigation.databinding.FragmentMainBinding

class MainFragment : Fragment(), View.OnClickListener {

    private var binding: FragmentMainBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentMainBinding.bind(view)
        this.binding = binding

        binding.fragmentMainOpenModuleAButton.setOnClickListener(this)
        binding.fragmentMainOpenModuleBButton.setOnClickListener(this)
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.fragment_main_open_module_a_button -> findNavController().navigate(
                MainFragmentDirections.actionFragmentMainToFragmentA()
            )
            R.id.fragment_main_open_module_b_button -> findNavController().navigate(
                MainFragmentDirections.actionFragmentMainToFragmentB()
            )
        }
    }

//    findNavController().navigate(
//                FragmentADirections.actionFragmentAToFragmentC(
//                    binding.fragmentAValueEditText.text.toString()
//                )
//            )
}
