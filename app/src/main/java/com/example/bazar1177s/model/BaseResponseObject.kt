package com.example.bazar1177s.model

data class BaseResponseObject<T>(
    val success: Boolean,
    val message: String,
    val data : T
)