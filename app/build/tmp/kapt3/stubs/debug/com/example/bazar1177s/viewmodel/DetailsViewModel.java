package com.example.bazar1177s.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010\u000f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010!\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010\u0019\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R&\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R&\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012\u00a8\u0006$"}, d2 = {"Lcom/example/bazar1177s/viewmodel/DetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "detailsRepository", "Lcom/example/bazar1177s/repository/DetailsRepository;", "(Lcom/example/bazar1177s/repository/DetailsRepository;)V", "_amount", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/bazar1177s/utils/UiStateObject;", "", "_deleteProduct", "", "_getProductState", "Lcom/example/bazar1177s/model/Product;", "_saveProduct", "amount", "getAmount", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setAmount", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "deleteProduct", "getDeleteProduct", "setDeleteProduct", "getProductState", "getGetProductState", "setGetProductState", "saveProduct", "getSaveProduct", "setSaveProduct", "delete", "Lkotlinx/coroutines/Job;", "id", "", "productId", "getProduct", "productOrder", "Lcom/example/bazar1177s/model/ProductOrder;", "app_debug"})
public final class DetailsViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.bazar1177s.repository.DetailsRepository detailsRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateObject<com.example.bazar1177s.model.Product>> _getProductState = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateObject<com.example.bazar1177s.model.Product>> getProductState;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateObject<java.lang.Integer>> _amount = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateObject<java.lang.Integer>> amount;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateObject<java.lang.Boolean>> _saveProduct = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateObject<java.lang.Boolean>> saveProduct;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateObject<java.lang.Boolean>> _deleteProduct = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateObject<java.lang.Boolean>> deleteProduct;
    
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
    public final kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateObject<java.lang.Integer>> getAmount() {
        return null;
    }
    
    public final void setAmount(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateObject<java.lang.Integer>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateObject<java.lang.Boolean>> getSaveProduct() {
        return null;
    }
    
    public final void setSaveProduct(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateObject<java.lang.Boolean>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateObject<java.lang.Boolean>> getDeleteProduct() {
        return null;
    }
    
    public final void setDeleteProduct(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateObject<java.lang.Boolean>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getProduct(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getAmount(long productId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job saveProduct(@org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.model.ProductOrder productOrder) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job delete(long id) {
        return null;
    }
}