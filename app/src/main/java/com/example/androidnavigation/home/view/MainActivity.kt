package com.example.androidnavigation.home.view

import android.os.Bundle
import com.example.androidnavigation.base.BaseActivity
import com.example.androidnavigation.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
