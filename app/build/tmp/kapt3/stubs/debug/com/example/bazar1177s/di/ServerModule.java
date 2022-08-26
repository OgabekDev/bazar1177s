package com.example.bazar1177s.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0007\u00a8\u0006\r"}, d2 = {"Lcom/example/bazar1177s/di/ServerModule;", "", "()V", "getClient", "Lokhttp3/OkHttpClient;", "pref", "Lcom/example/bazar1177s/data/pref/AppPref;", "getProductService", "Lcom/example/bazar1177s/network/ProductService;", "retrofit", "Lretrofit2/Retrofit;", "getRetrofit", "client", "app_debug"})
@dagger.Module()
public final class ServerModule {
    
    public ServerModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "Normal")
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit getRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.bazar1177s.network.ProductService getProductService(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "Normal")
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient getClient(@org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.data.pref.AppPref pref) {
        return null;
    }
}