package com.example.dogapp.data.api

class ApiHelper(private val apiService: ApiService) {

    suspend fun getDogsByBreeds() = apiService.getDogsByBreeds()
    suspend fun getSearchByBreeds() = apiService.getDogsBySearch()
}