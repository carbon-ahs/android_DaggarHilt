package com.axiagroups.daggerhilt.di

import com.axiagroups.daggerhilt.data.remote.MyApi
import com.axiagroups.daggerhilt.data.repository.MyRepositoryImpl
import com.axiagroups.daggerhilt.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton


/**
 * Created by Ahsan Habib on 5/19/2024.
 * shehanuk.ahsan@gmail.com
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMyApi(): MyApi {
        return Retrofit.Builder()
            .baseUrl("jhfjc")
            .build()
            .create(MyApi::class.java)
    }

    @Provides
    @Singleton
    fun provideMyRepository(api: MyApi) : MyRepository {
        return MyRepositoryImpl(api)
    }
}