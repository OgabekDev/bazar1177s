package com.example.bazar1177s.repository

import com.example.bazar1177s.data.db.ProductDao
import com.example.bazar1177s.data.db.ProductOrderDao
import com.example.bazar1177s.network.ProductService
import javax.inject.Inject

class OrderRepository @Inject constructor(
    private val productService: ProductService,
    private val dao: ProductOrderDao
) {
    suspend fun getProducts() = dao.getProducts()
    suspend fun deleteProduct(id: Long) = dao.deleteProduct(id)
    suspend fun clearProducts() = dao.clearOrderedProducts()
}