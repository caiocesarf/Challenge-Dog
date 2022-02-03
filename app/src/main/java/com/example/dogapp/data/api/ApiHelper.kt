package com.example.dogapp.data.api

class ApiHelper(private val apiService: ApiService) {

    private val apiKey = "3887a2f4-e1cb-4adb-9495-0050d4cf2966"


    suspend fun getDogsByBreeds() = apiService.getDogsByBreeds(apiKey = apiKey)
    suspend fun getSearchByBreeds() = apiService.getDogsBySearch(apiKey)
}