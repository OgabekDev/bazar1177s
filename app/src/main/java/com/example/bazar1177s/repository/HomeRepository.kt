package com.example.bazar1177s.repository

import com.example.bazar1177s.data.db.ProductDao
import com.example.bazar1177s.network.ProductService
import javax.inject.Inject

class HomeRepository @Inject constructor(
    private val productService: ProductService, private val productDao: ProductDao
) {
    suspend fun getShops() = productService.getShops()

    suspend fun getCarouselProducts() = productService.getCarouselProducts()

    suspend fun getDiscountProducts() = productService.getDiscountProducts()

}