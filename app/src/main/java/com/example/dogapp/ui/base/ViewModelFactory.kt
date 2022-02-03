package com.example.dogapp.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.dogapp.data.api.ApiHelper
import com.example.dogapp.ui.main.viewmodel.MainViewModel
import com.example.dogapp.data.repository.MainRepository


class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}

