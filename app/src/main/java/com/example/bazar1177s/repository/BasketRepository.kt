package com.example.bazar1177s.repository

import com.example.bazar1177s.data.db.ProductDao
import com.example.bazar1177s.model.OrderedProducts
import com.example.bazar1177s.network.ProductService
import javax.inject.Inject

class BasketRepository @Inject constructor(
    private val productService: ProductService, private val productDao: ProductDao
) {
    suspend fun getShopCategories(id: Int) = productService.getCategoriesByShops(id)
    suspend fun getProducts(id:Int) = productService.getProductsByCategoryId(id)
    suspend fun addProductsToDataBase(newProduct:OrderedProducts) = productDao.addProduct(newProduct)
}