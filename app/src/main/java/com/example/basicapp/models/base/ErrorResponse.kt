package com.example.basicapp.models.base

import com.google.gson.annotations.SerializedName

data class ErrorResponse (
    @SerializedName("code") val code : Int?,
    @SerializedName("level") val level : Int?,
    @SerializedName("message") val message : String?
)