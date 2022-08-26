package com.example.bazar1177s.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/example/bazar1177s/repository/BasketRepository;", "", "productService", "Lcom/example/bazar1177s/network/ProductService;", "productDao", "Lcom/example/bazar1177s/data/db/ProductDao;", "(Lcom/example/bazar1177s/network/ProductService;Lcom/example/bazar1177s/data/db/ProductDao;)V", "addProductsToDataBase", "", "newProduct", "Lcom/example/bazar1177s/model/OrderedProducts;", "(Lcom/example/bazar1177s/model/OrderedProducts;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProducts", "Lcom/example/bazar1177s/model/BaseResponseList;", "Lcom/example/bazar1177s/model/Product;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getShopCategories", "Lcom/example/bazar1177s/model/ShopCategory;", "app_debug"})
public final class BasketRepository {
    private final com.example.bazar1177s.network.ProductService productService = null;
    private final com.example.bazar1177s.data.db.ProductDao productDao = null;
    
    @javax.inject.Inject()
    public BasketRepository(@org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.network.ProductService productService, @org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.data.db.ProductDao productDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getShopCategories(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.bazar1177s.model.BaseResponseList<com.example.bazar1177s.model.ShopCategory>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getProducts(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.bazar1177s.model.BaseResponseList<com.example.bazar1177s.model.Product>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addProductsToDataBase(@org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.model.OrderedProducts newProduct, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}