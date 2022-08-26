package com.example.bazar1177s.model

import java.net.Inet4Address

data class SendOrder(
    val products:List<OrderedProducts>,
    val userName:String,
    val phoneNumber:String,
    val extraPhoneNumber:String,
    val city:String,
    val address: String
)