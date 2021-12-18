package com.example.basicapp.repositories

import com.example.basicapp.api.ApiHelper

class MainRepository (private val apiHelper: ApiHelper): BaseRepository() {

    suspend fun getUsers() =  apiHelper.getUsers()

}