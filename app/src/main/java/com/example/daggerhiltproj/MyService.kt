package com.plcoding.daggerhiltcourse

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.example.daggerhiltproj.domain.repository.MyRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MyService: Service() {


    //field injection
    @Inject
    lateinit var repository: MyRepository

    override fun onCreate() {
        super.onCreate()
    }

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }
}