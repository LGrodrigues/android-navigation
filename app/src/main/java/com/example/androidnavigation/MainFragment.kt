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

        setupView()
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.fragment_main_open_primary_colors_button -> {
                findNavController().navigate(
                    Uri.parse("myapp://androidnavigation/primary_colors_fragment_blue")
                )
            }
            //Or MainFragmentDirections.actionFragmentMainToFragmentA()
            R.id.fragment_main_open_secondary_colors_button -> findNavController().navigate(
                Uri.parse("myapp://androidnavigation/secondary_colors_fragment_orange")
            )
            //Or MainFragmentDirections.actionFragmentMainToFragmentB()
            R.id.fragment_main_open_normal_green_fragment_button -> {
                findNavController().navigate(
                    Uri.parse("myapp://androidnavigation/green_fragment_dark_green")
                )
            }
        }
    }

    private fun setupView() = with(binding) {
        fragmentMainTitle.text = getString(R.string.fragment_main_title)

        fragmentMainOpenPrimaryColorsButton.run {
            text = getString(R.string.fragment_main_open_primary_colors_button_text)
            setOnClickListener(this@MainFragment)
        }

        fragmentMainOpenSecondaryColorsButton.run {
            text = getString(R.string.fragment_main_open_secondary_colors_button_text)
            setOnClickListener(this@MainFragment)
        }

        fragmentMainOpenNormalGreenFragmentButton.run {
            text = getString(R.string.fragment_main_open_normal_green_button_text)
            setOnClickListener(this@MainFragment)
        }
    }
}
