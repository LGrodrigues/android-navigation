package com.example.androidnavigation.home

import com.example.callapi.ResultApi
import com.example.callapi.base.BaseRepository

class HomeRepositoryImpl(private val service: HomeApi) : HomeRepository, BaseRepository() {

    override suspend fun getHomes(): ResultApi {
        return safeCallApi {
            service.getHomes()
        }
    }
}