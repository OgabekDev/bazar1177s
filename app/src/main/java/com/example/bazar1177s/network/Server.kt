package com.example.bazar1177s.network

object Server {
    val IS_TESTER = true

    external fun getDevelopment(): String
    external fun getProduction(): String
}