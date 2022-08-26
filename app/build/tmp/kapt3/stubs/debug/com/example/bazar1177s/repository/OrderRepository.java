package com.example.bazar1177s.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/example/bazar1177s/repository/OrderRepository;", "", "productService", "Lcom/example/bazar1177s/network/ProductService;", "dao", "Lcom/example/bazar1177s/data/db/ProductOrderDao;", "(Lcom/example/bazar1177s/network/ProductService;Lcom/example/bazar1177s/data/db/ProductOrderDao;)V", "clearProducts", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteProduct", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProducts", "", "Lcom/example/bazar1177s/model/ProductOrder;", "app_debug"})
public final class OrderRepository {
    private final com.example.bazar1177s.network.ProductService productService = null;
    private final com.example.bazar1177s.data.db.ProductOrderDao dao = null;
    
    @javax.inject.Inject()
    public OrderRepository(@org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.network.ProductService productService, @org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.data.db.ProductOrderDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getProducts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.bazar1177s.model.ProductOrder>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteProduct(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object clearProducts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}