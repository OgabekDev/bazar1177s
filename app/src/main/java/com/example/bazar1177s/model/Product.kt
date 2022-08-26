package com.example.bazar1177s.model

import java.io.Serializable

data class Product (
    val id: Long,
    val name: String,
    val price: Long,
    val type: Type,
    val category: Category,
    val about: String,
    val image: Image
)

data class Image (
    val id: Long,
    val name: String,
    val contentType: String,
    val size: Long,
    val data: String
)

data class Type (
    val id: Long,
    val name: String,
    val description: String
)

