package com.example.bazar1177s.model

import androidx.room.Entity
import androidx.room.OnConflictStrategy
import androidx.room.PrimaryKey

@Entity(tableName = "Products")
class OrderedProducts(
    @PrimaryKey
    val id:Int,
    val name:String,
    val amount:Int = 0,
    val typeId: Int
)