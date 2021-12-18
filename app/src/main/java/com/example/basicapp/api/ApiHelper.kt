package com.example.basicapp.api

import com.example.basicapp.models.User
import retrofit2.Response

interface ApiHelper {

    suspend fun getUsers(): Response<List<User>>

}