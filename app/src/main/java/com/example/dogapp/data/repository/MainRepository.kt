package com.example.dogapp.data.repository

import com.example.dogapp.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getDogsBreeds() = apiHelper.getDogsByBreeds()
    suspend fun getSearchByBreeds() = apiHelper.getSearchByBreeds()

}