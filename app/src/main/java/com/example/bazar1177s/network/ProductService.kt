package com.example.bazar1177s.network

import com.example.bazar1177s.model.*
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ProductService {

//auth

    @POST("/api/user/register")
    suspend fun loginAndGetAccessToken(@Body user: LoginUser): LoginResponse

    @GET("/api/shops")
    suspend fun getShops(): List<Shop>

    @GET("api/categoriesByShopId/{id}")
    suspend fun getCategoriesByShops(@Path("id") id: Int): BaseResponseList<ShopCategory>

    @GET("api/productsByCategoryId/{id}")
    suspend fun getProductsByCategoryId(@Path("id") id: Int): BaseResponseList<Product>

    @GET("api/carousel")
    suspend fun getCarouselProducts(): BaseResponseList<CarouselProduct>

    @GET("api/discounts")
    suspend fun getDiscountProducts(): BaseResponseList<DiscountProduct>

    @GET("api/product/{id}")
    suspend fun getProduct(@Path("id") id: Long): BaseResponseObject<Product>

}