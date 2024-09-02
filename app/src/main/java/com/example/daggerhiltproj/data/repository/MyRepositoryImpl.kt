package com.example.daggerhiltproj.data.repository

import com.example.daggerhiltproj.data.remote.MyApi
import com.example.daggerhiltproj.domain.repository.MyRepository

class MyRepositoryImpl(api: MyApi) : MyRepository{

    override suspend fun doNetworkCall() {
        super.doNetworkCall()
    }
}