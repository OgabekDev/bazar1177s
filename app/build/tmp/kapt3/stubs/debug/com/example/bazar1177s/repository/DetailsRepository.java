package com.example.bazar1177s.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/bazar1177s/repository/DetailsRepository;", "", "productService", "Lcom/example/bazar1177s/network/ProductService;", "productDao", "Lcom/example/bazar1177s/data/db/ProductDao;", "(Lcom/example/bazar1177s/network/ProductService;Lcom/example/bazar1177s/data/db/ProductDao;)V", "getProduct", "Lcom/example/bazar1177s/model/BaseResponseObject;", "Lcom/example/bazar1177s/model/Product;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class DetailsRepository {
    private final com.example.bazar1177s.network.ProductService productService = null;
    private final com.example.bazar1177s.data.db.ProductDao productDao = null;
    
    @javax.inject.Inject()
    public DetailsRepository(@org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.network.ProductService productService, @org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.data.db.ProductDao productDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getProduct(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.bazar1177s.model.BaseResponseObject<com.example.bazar1177s.model.Product>> continuation) {
        return null;
    }
}