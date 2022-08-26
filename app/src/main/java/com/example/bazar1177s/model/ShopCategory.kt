package com.example.bazar1177s.model

import java.io.Serializable

data class ShopCategory(
    val id: Int,
    val image: Image,
    val name: String,
    val serialNumber: Int,
    val shop: Shop
)