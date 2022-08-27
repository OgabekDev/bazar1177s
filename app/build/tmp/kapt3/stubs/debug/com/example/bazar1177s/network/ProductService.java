package com.example.bazar1177s.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\b\u001a\u00020\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u001b\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/example/bazar1177s/network/ProductService;", "", "getCarouselProducts", "Lcom/example/bazar1177s/model/BaseResponseList;", "Lcom/example/bazar1177s/model/CarouselProduct;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategoriesByShops", "Lcom/example/bazar1177s/model/ShopCategory;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDiscountProducts", "Lcom/example/bazar1177s/model/DiscountProduct;", "getProduct", "Lcom/example/bazar1177s/model/BaseResponseObject;", "Lcom/example/bazar1177s/model/Product;", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductsByCategoryId", "getShops", "", "Lcom/example/bazar1177s/model/Shop;", "loginAndGetAccessToken", "Lcom/example/bazar1177s/model/LoginResponse;", "user", "Lcom/example/bazar1177s/model/LoginUser;", "(Lcom/example/bazar1177s/model/LoginUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ProductService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/api/user/register")
    public abstract java.lang.Object loginAndGetAccessToken(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.bazar1177s.model.LoginUser user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.bazar1177s.model.LoginResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/api/shops")
    public abstract java.lang.Object getShops(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.bazar1177s.model.Shop>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/categoriesByShopId/{id}")
    public abstract java.lang.Object getCategoriesByShops(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.bazar1177s.model.BaseResponseList<com.example.bazar1177s.model.ShopCategory>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/productsByCategoryId/{id}")
    public abstract java.lang.Object getProductsByCategoryId(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.bazar1177s.model.BaseResponseList<com.example.bazar1177s.model.Product>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/carousel")
    public abstract java.lang.Object getCarouselProducts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.bazar1177s.model.BaseResponseList<com.example.bazar1177s.model.CarouselProduct>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/discounts")
    public abstract java.lang.Object getDiscountProducts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.bazar1177s.model.BaseResponseList<com.example.bazar1177s.model.DiscountProduct>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/product/{id}")
    public abstract java.lang.Object getProduct(@retrofit2.http.Path(value = "id")
    long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.bazar1177s.model.BaseResponseObject<com.example.bazar1177s.model.Product>> continuation);
}