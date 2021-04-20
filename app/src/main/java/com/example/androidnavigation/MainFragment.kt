package com.example.androidnavigation

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.androidnavigation.databinding.FragmentMainBinding

class MainFragment : Fragment(), View.OnClickListener {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            fragmentMainTitle.text = getString(R.string.fragment_main_title)
            fragmentMainOpenModuleAButton.run {
                text = getString(R.string.fragment_main_open_modulea_button_text)
                setOnClickListener(this@MainFragment)
            }

            fragmentMainOpenModuleBButton.run {
                text = getString(R.string.fragment_main_open_moduleb_button_text)
                setOnClickListener(this@MainFragment)
            }
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.fragment_main_open_module_a_button -> findNavController().navigate(
                Uri.parse("myapp://androidnavigation/modulea_fragment_a")
            )
            //Or MainFragmentDirections.actionFragmentMainToFragmentA()
            R.id.fragment_main_open_module_b_button -> findNavController().navigate(
                Uri.parse("myapp://androidnavigation/moduleb_fragment_b")
            )
            //Or MainFragmentDirections.actionFragmentMainToFragmentB()
        }
    }
}
