package com.example.androidnavigation

import android.app.Application
import com.example.androidnavigation.home.Network.homeModule
import com.example.androidnavigation.home.Network.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


class AndroidNavigationApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        loadingKoin()

    }

    private fun loadingKoin(){
        startKoin{
            androidContext(this@AndroidNavigationApplication)
            modules(homeModule, viewModelModule)
        }
    }
}