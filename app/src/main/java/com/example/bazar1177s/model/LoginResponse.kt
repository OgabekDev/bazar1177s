package com.example.bazar1177s.model

data class LoginResponse (
    val accessToken: String,
    val tokenType: String,
    val refreshToken: String
)
