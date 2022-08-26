package com.example.bazar1177s.model

import java.io.Serializable

data class CarouselProduct (
    val id: Long,
    val serialNumber: Long,
    val product: Product
)

data class Category (
    val id: Long,
    val name: String,
    val serialNumber: Long,
    val image: Image,
    val shop: ShopCategory? = null,
    val content: Boolean? = null
)


enum class ContentType {
    ImageJPEG,
    ImagePNG
}


