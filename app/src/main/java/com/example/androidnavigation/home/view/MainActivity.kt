package com.example.androidnavigation.home.view

import android.os.Bundle
import com.example.androidnavigation.base.BaseActivity
import com.example.androidnavigation.databinding.ActivityMainBinding
import com.example.androidnavigation.helper.viewBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    private val binding by viewBinding(ActivityMainBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun getViewBinding() = ActivityMainBinding.inflate(layoutInflater)
}
