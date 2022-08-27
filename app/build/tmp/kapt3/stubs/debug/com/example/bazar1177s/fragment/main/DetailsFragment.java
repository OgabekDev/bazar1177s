package com.example.bazar1177s.fragment.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001aH\u0002J\u0012\u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u001aH\u0016J\u001a\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010&\u001a\u00020\u001aH\u0002J\u0010\u0010\'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006+"}, d2 = {"Lcom/example/bazar1177s/fragment/main/DetailsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "amount", "", "binding", "Lcom/example/bazar1177s/databinding/FragmentDetailsBinding;", "getBinding", "()Lcom/example/bazar1177s/databinding/FragmentDetailsBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "product", "Lcom/example/bazar1177s/model/ProductOrder;", "productId", "", "getProductId", "()J", "setProductId", "(J)V", "viewModel", "Lcom/example/bazar1177s/viewmodel/DetailsViewModel;", "getViewModel", "()Lcom/example/bazar1177s/viewmodel/DetailsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "cancelLoading", "", "initDetails", "data", "Lcom/example/bazar1177s/model/Product;", "initViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onViewCreated", "view", "Landroid/view/View;", "setUpObservers", "showError", "message", "", "showLoading", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class DetailsFragment extends androidx.fragment.app.Fragment {
    private long productId = 0L;
    private int amount = 0;
    private com.example.bazar1177s.model.ProductOrder product;
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public DetailsFragment() {
        super();
    }
    
    public final long getProductId() {
        return 0L;
    }
    
    public final void setProductId(long p0) {
    }
    
    private final com.example.bazar1177s.databinding.FragmentDetailsBinding getBinding() {
        return null;
    }
    
    private final com.example.bazar1177s.viewmodel.DetailsViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViews() {
    }
    
    private final void setUpObservers() {
    }
    
    private final void initDetails(com.example.bazar1177s.model.Product data) {
    }
    
    private final void showError(java.lang.String message) {
    }
    
    private final void cancelLoading() {
    }
    
    private final void showLoading() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
}