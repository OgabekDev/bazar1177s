package com.example.bazar1177s.repository

import com.example.bazar1177s.data.db.ProductDao
import com.example.bazar1177s.data.db.ProductOrderDao
import com.example.bazar1177s.model.Product
import com.example.bazar1177s.model.ProductOrder
import com.example.bazar1177s.network.ProductService
import javax.inject.Inject

class DetailsRepository @Inject constructor(
    private val productService: ProductService,
    private val dao: ProductOrderDao
) {
    suspend fun getProduct(id: Long) = productService.getProduct(id)
    suspend fun saveProduct(product: ProductOrder)=dao.addProduct(product)
    suspend fun getAmount(productId:Long)=dao.getAmount(productId)
    suspend fun delete(id:Long)=dao.deleteProduct(id)
}