package com.example.bazar1177s.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001b\u001a\u00020\u0019R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/bazar1177s/viewmodel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "homeRepository", "Lcom/example/bazar1177s/repository/HomeRepository;", "(Lcom/example/bazar1177s/repository/HomeRepository;)V", "_getCarouselProductState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/bazar1177s/utils/UiStateList;", "Lcom/example/bazar1177s/model/CarouselProduct;", "_getDiscountProductState", "Lcom/example/bazar1177s/model/DiscountProduct;", "_getShopState", "Lcom/example/bazar1177s/model/Shop;", "getCarouselProductState", "getGetCarouselProductState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setGetCarouselProductState", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "getDiscountProductState", "getGetDiscountProductState", "setGetDiscountProductState", "getShopState", "getGetShopState", "setGetShopState", "getCarouselProducts", "Lkotlinx/coroutines/Job;", "getDiscountProducts", "getShops", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.bazar1177s.repository.HomeRepository homeRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateList<com.example.bazar1177s.model.Shop>> _getShopState = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateList<com.example.bazar1177s.model.Shop>> getShopState;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateList<com.example.bazar1177s.model.CarouselProduct>> _getCarouselProductState = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateList<com.example.bazar1177s.model.CarouselProduct>> getCarouselProductState;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateList<com.example.bazar1177s.model.DiscountProduct>> _getDiscountProductState = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateList<com.example.bazar1177s.model.DiscountProduct>> getDiscountProductState;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.repository.HomeRepository homeRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateList<com.example.bazar1177s.model.Shop>> getGetShopState() {
        return null;
    }
    
    public final void setGetShopState(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateList<com.example.bazar1177s.model.Shop>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getShops() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateList<com.example.bazar1177s.model.CarouselProduct>> getGetCarouselProductState() {
        return null;
    }
    
    public final void setGetCarouselProductState(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateList<com.example.bazar1177s.model.CarouselProduct>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getCarouselProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateList<com.example.bazar1177s.model.DiscountProduct>> getGetDiscountProductState() {
        return null;
    }
    
    public final void setGetDiscountProductState(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateList<com.example.bazar1177s.model.DiscountProduct>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getDiscountProducts() {
        return null;
    }
}