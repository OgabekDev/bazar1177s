package com.example.bazar1177s.repository

import com.example.bazar1177s.data.db.ProductDao
import com.example.bazar1177s.model.LoginUser
import com.example.bazar1177s.network.ProductService
import javax.inject.Inject

class AuthRepository @Inject constructor(
    private val productService: ProductService, private val productDao: ProductDao
) {
    suspend fun login(user:LoginUser) = productService.loginAndGetAccessToken(user)
}