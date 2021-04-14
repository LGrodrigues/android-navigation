package com.example.androidnavigation.home

import com.example.callapi.ResultApi

interface HomeRepository {
    suspend fun getHomes(): ResultApi
}