package com.example.dogapp.data.api

import BreedsDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiService {

    @GET("/breeds/")
    suspend fun getDogsByBreeds(
        @Query("x-api-key") apiKey : String
        ):  List<BreedsDTO>

    @GET("/breeds/search")
    suspend fun getDogsBySearch(
        @Query("x-api-key") apiKey : String
    ):  List<BreedsDTO>


}