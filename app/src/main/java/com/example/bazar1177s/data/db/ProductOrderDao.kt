package com.example.bazar1177s.data.db

import androidx.room.*
import com.example.bazar1177s.model.ProductOrder

@Dao
interface ProductOrderDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addProduct(productOrder: ProductOrder)

    @Query("SELECT * FROM ordered_products")
    suspend fun getProducts(): List<ProductOrder>

    @Query("DELETE FROM ordered_products WHERE id=:id")
    suspend fun deleteProduct(id: Long)

    @Query("DELETE FROM ordered_products")
    suspend fun clearOrderedProducts()

    @Query("SELECT entity FROM ordered_products WHERE id=:productId")
    suspend fun getAmount(productId: Long): Int
}