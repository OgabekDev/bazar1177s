package com.example.bazar1177s.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.bazar1177s.model.OrderedProducts
import com.example.bazar1177s.model.Product

@Dao
interface ProductDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addProduct(product: OrderedProducts)
}