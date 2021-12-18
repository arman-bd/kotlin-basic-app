package com.example.basicapp.viewmodels

import com.example.basicapp.repositories.MainRepository
import com.example.basicapp.utils.NetworkHelper

class MainViewModel (
    private val mainRepository: MainRepository,
    private val networkHelper: NetworkHelper
): BaseViewModel() {

}