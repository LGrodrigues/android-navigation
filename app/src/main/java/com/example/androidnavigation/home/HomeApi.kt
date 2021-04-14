package com.example.androidnavigation.home

import com.example.callapi.NetworkService.createClientByService
import org.koin.dsl.module
import retrofit2.Response
import retrofit2.http.GET

interface HomeApi {

    @GET("/")
    suspend fun getHomes(): Response<List<String>>

}

object Network {

    val homeModule = module {
        createClientByService<HomeApi>("/")
    }

    val viewModelModule = module {
        single { HomeViewModel(get()) }
        factory<HomeRepository> { HomeRepositoryImpl(get()) }
    }

}

