package com.example.basicapp.models.base

import com.google.gson.annotations.SerializedName

data class BaseResponse<T> (
    @SerializedName("isOk") val isOk : Boolean,
    @SerializedName("data") val  data: T?,
    @SerializedName("message") val message : String?,
    @SerializedName("error") val error : ErrorResponse?
)