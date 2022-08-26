package com.example.bazar1177s.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lcom/example/bazar1177s/viewmodel/DetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "detailsRepository", "Lcom/example/bazar1177s/repository/DetailsRepository;", "(Lcom/example/bazar1177s/repository/DetailsRepository;)V", "_getProductState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/bazar1177s/utils/UiStateObject;", "Lcom/example/bazar1177s/model/Product;", "getProductState", "getGetProductState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setGetProductState", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "getProduct", "Lkotlinx/coroutines/Job;", "id", "", "app_debug"})
public final class DetailsViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.bazar1177s.repository.DetailsRepository detailsRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateObject<com.example.bazar1177s.model.Product>> _getProductState = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateObject<com.example.bazar1177s.model.Product>> getProductState;
    
    @javax.inject.Inject()
    public DetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.repository.DetailsRepository detailsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateObject<com.example.bazar1177s.model.Product>> getGetProductState() {
        return null;
    }
    
    public final void setGetProductState(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateObject<com.example.bazar1177s.model.Product>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getProduct(int id) {
        return null;
    }
}