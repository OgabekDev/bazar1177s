package com.example.bazar1177s.model

data class BaseResponseList<T>(
    val success: Boolean,
    val message: String,
    val data: List<T>
)