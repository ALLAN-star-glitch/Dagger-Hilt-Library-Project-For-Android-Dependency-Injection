package com.example.daggerhiltproj.data.di

import com.example.daggerhiltproj.data.remote.MyApi
import com.example.daggerhiltproj.data.repository.MyRepositoryImpl
import com.example.daggerhiltproj.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class) //SingletonComponent decides about the lifetime of our dependencies in this AppModule
object AppModule {

    @Provides //tells dagger that this function provides a dependency
    @Singleton //to ensure a singleton instance of the MyApi
    fun provideMyApi(): MyApi{
        return Retrofit.Builder()
            .baseUrl("https://test.com")
            .build()
            .create(MyApi::class.java)
    }

    @Provides
    @Singleton
    fun provideMyRepository(api: MyApi): MyRepository{
        return MyRepositoryImpl(api)
    }
}