package com.example.dogapp.data.api

import BreedsDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface ApiService {

    companion object {
        const val API_KEY = "3887a2f4-e1cb-4adb-9495-0050d4cf2966"
    }

    @Headers(API_KEY)
    @GET("/breeds")
    suspend fun getDogsByBreeds():  List<BreedsDTO>

    @Headers(API_KEY)
    @GET("/breeds/search")
    suspend fun getDogsBySearch():  List<BreedsDTO>


}