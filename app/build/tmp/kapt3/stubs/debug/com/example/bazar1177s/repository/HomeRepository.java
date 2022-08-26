package com.example.bazar1177s.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/bazar1177s/repository/HomeRepository;", "", "productService", "Lcom/example/bazar1177s/network/ProductService;", "productDao", "Lcom/example/bazar1177s/data/db/ProductDao;", "(Lcom/example/bazar1177s/network/ProductService;Lcom/example/bazar1177s/data/db/ProductDao;)V", "getCarouselProducts", "Lcom/example/bazar1177s/model/BaseResponseList;", "Lcom/example/bazar1177s/model/CarouselProduct;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDiscountProducts", "Lcom/example/bazar1177s/model/DiscountProduct;", "getShops", "", "Lcom/example/bazar1177s/model/Shop;", "app_debug"})
public final class HomeRepository {
    private final com.example.bazar1177s.network.ProductService productService = null;
    private final com.example.bazar1177s.data.db.ProductDao productDao = null;
    
    @javax.inject.Inject()
    public HomeRepository(@org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.network.ProductService productService, @org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.data.db.ProductDao productDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getShops(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.bazar1177s.model.Shop>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCarouselProducts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.bazar1177s.model.BaseResponseList<com.example.bazar1177s.model.CarouselProduct>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDiscountProducts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.bazar1177s.model.BaseResponseList<com.example.bazar1177s.model.DiscountProduct>> continuation) {
        return null;
    }
}