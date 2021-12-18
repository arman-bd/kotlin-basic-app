package com.example.basicapp.models

import com.google.gson.annotations.SerializedName

data class User (
    @SerializedName("id") val id : Int,
    @SerializedName("userName") val userName : String,
    @SerializedName("fullName") val fullName : String,
    @SerializedName("phoneNumber") val phoneNumber : Int
)