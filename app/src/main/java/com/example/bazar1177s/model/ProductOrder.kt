package com.example.bazar1177s.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ordered_products")
data class ProductOrder(
    @PrimaryKey(autoGenerate = true) val id: Long?=null,
    var image: String,
    var name: String,
    var price: Long,
    var type: String,
    var entity: Int,
    var total: Long,
    var productId: Long,

    )
