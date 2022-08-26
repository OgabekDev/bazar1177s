package com.example.bazar1177s.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/example/bazar1177s/viewmodel/BasketViewModel;", "Landroidx/lifecycle/ViewModel;", "basketRepository", "Lcom/example/bazar1177s/repository/BasketRepository;", "(Lcom/example/bazar1177s/repository/BasketRepository;)V", "_getProducstState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/bazar1177s/utils/UiStateList;", "Lcom/example/bazar1177s/model/Product;", "_getShopCategoryState", "Lcom/example/bazar1177s/model/ShopCategory;", "getProductsState", "getGetProductsState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setGetProductsState", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "getShopCategoryState", "getGetShopCategoryState", "setGetShopCategoryState", "addProductToDataBase", "Lkotlinx/coroutines/Job;", "newProduct", "Lcom/example/bazar1177s/model/OrderedProducts;", "getProducts", "id", "", "getShopCategories", "app_debug"})
public final class BasketViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.bazar1177s.repository.BasketRepository basketRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateList<com.example.bazar1177s.model.ShopCategory>> _getShopCategoryState = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateList<com.example.bazar1177s.model.ShopCategory>> getShopCategoryState;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateList<com.example.bazar1177s.model.Product>> _getProducstState = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateList<com.example.bazar1177s.model.Product>> getProductsState;
    
    @javax.inject.Inject()
    public BasketViewModel(@org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.repository.BasketRepository basketRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateList<com.example.bazar1177s.model.ShopCategory>> getGetShopCategoryState() {
        return null;
    }
    
    public final void setGetShopCategoryState(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateList<com.example.bazar1177s.model.ShopCategory>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getShopCategories(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateList<com.example.bazar1177s.model.Product>> getGetProductsState() {
        return null;
    }
    
    public final void setGetProductsState(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateList<com.example.bazar1177s.model.Product>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getProducts(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job addProductToDataBase(@org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.model.OrderedProducts newProduct) {
        return null;
    }
}