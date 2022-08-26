package com.example.bazar1177s.model

import java.io.Serializable

data class DiscountProduct(
    val id: Long,
    val product: Product,
    val percent: Long
)

enum class Name {
    Mevalar,
    OziqOvqatMahsulotlari,
    Sabzavotlar
}

