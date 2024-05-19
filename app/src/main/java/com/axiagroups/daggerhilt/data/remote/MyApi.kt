package com.axiagroups.daggerhilt.data.remote

import retrofit2.http.GET


/**
 * Created by Ahsan Habib on 5/19/2024.
 * shehanuk.ahsan@gmail.com
 */
interface MyApi {
    @GET("test")
    suspend fun doNetworkCall()
}