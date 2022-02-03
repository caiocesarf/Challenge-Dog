package com.mindorks.retrofit.coroutines.data.repository

import com.example.dogapp.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()
}