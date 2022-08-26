package com.example.bazar1177s.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Product1(
    @PrimaryKey
    val id: String,
    val name: String
)