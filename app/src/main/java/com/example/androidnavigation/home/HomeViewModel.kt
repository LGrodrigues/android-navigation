package com.example.androidnavigation.home

import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class HomeViewModel(private val repository: HomeRepository) : BaseViewModel() {


    fun test() {
        viewModelScope.launch {
            safeCall(
                call = {
                    repository.getHomes()
                },
                onSuccess = { success(it as? List<String>) },
                onError = { error() }
            )
        }
    }

    private fun error(){

    }
    private fun success(it : List<String>?){

    }

}