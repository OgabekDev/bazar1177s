package com.example.bazar1177s.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u0016\u001a\u00020\u0019R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/bazar1177s/viewmodel/OrderProductViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/bazar1177s/repository/OrderRepository;", "(Lcom/example/bazar1177s/repository/OrderRepository;)V", "_cleared", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/bazar1177s/utils/UiStateObject;", "", "_deleted", "_products", "Lcom/example/bazar1177s/utils/UiStateList;", "Lcom/example/bazar1177s/model/ProductOrder;", "cleared", "getCleared", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setCleared", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "deleted", "getDeleted", "setDeleted", "products", "getProducts", "setProducts", "clearOrder", "Lkotlinx/coroutines/Job;", "deleteProduct", "id", "", "app_debug"})
public final class OrderProductViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.bazar1177s.repository.OrderRepository repository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateList<com.example.bazar1177s.model.ProductOrder>> _products = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateList<com.example.bazar1177s.model.ProductOrder>> products;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateObject<java.lang.Boolean>> _deleted = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateObject<java.lang.Boolean>> deleted;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateObject<java.lang.Boolean>> _cleared = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateObject<java.lang.Boolean>> cleared;
    
    @javax.inject.Inject()
    public OrderProductViewModel(@org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.repository.OrderRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateList<com.example.bazar1177s.model.ProductOrder>> getProducts() {
        return null;
    }
    
    public final void setProducts(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateList<com.example.bazar1177s.model.ProductOrder>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateObject<java.lang.Boolean>> getDeleted() {
        return null;
    }
    
    public final void setDeleted(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateObject<java.lang.Boolean>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateObject<java.lang.Boolean>> getCleared() {
        return null;
    }
    
    public final void setCleared(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateObject<java.lang.Boolean>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteProduct(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job clearOrder() {
        return null;
    }
}