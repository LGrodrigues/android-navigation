package com.example.androidnavigation.home

import androidx.lifecycle.ViewModel
import com.example.callapi.ResultApi

abstract class BaseViewModel : ViewModel() {

    suspend fun <T> T.safeCall(
        call: suspend () -> ResultApi,
        onSuccess: (Any?) -> Unit,
        onError: (() -> Unit?)? = null
    ) {
        when (val response = call.invoke()) {
            is ResultApi.Success -> {
                onSuccess(response.data)
            }
            is ResultApi.Error -> {
                onError?.let { onError.invoke() }
            }
        }
    }
}