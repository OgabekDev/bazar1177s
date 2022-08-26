package com.example.bazar1177s.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\"#B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u001b\u001a\u00020\n2\n\u0010\u001c\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0010H\u0016J\u001c\u0010\u001e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR(\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e\u00a8\u0006$"}, d2 = {"Lcom/example/bazar1177s/adapter/ProductAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/bazar1177s/model/Product;", "Lcom/example/bazar1177s/adapter/ProductAdapter$ProductViewHolder;", "()V", "TAG", "", "addProduct", "Lkotlin/Function1;", "Lcom/example/bazar1177s/model/OrderedProducts;", "", "getAddProduct", "()Lkotlin/jvm/functions/Function1;", "setAddProduct", "(Lkotlin/jvm/functions/Function1;)V", "amount", "", "getAmount", "()I", "setAmount", "(I)V", "deleteProduct", "getDeleteProduct", "setDeleteProduct", "onClick", "getOnClick", "setOnClick", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ProductViewHolder", "app_debug"})
public final class ProductAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.bazar1177s.model.Product, com.example.bazar1177s.adapter.ProductAdapter.ProductViewHolder> {
    private final java.lang.String TAG = "ProductAdapter";
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.example.bazar1177s.model.Product, kotlin.Unit> onClick;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.example.bazar1177s.model.OrderedProducts, kotlin.Unit> addProduct;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.example.bazar1177s.model.OrderedProducts, kotlin.Unit> deleteProduct;
    private int amount = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.bazar1177s.adapter.ProductAdapter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.bazar1177s.model.Product> ITEM_DIF = null;
    
    public ProductAdapter() {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.example.bazar1177s.model.Product, kotlin.Unit> getOnClick() {
        return null;
    }
    
    public final void setOnClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.example.bazar1177s.model.Product, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.example.bazar1177s.model.OrderedProducts, kotlin.Unit> getAddProduct() {
        return null;
    }
    
    public final void setAddProduct(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.example.bazar1177s.model.OrderedProducts, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.example.bazar1177s.model.OrderedProducts, kotlin.Unit> getDeleteProduct() {
        return null;
    }
    
    public final void setDeleteProduct(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.example.bazar1177s.model.OrderedProducts, kotlin.Unit> p0) {
    }
    
    public final int getAmount() {
        return 0;
    }
    
    public final void setAmount(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.bazar1177s.adapter.ProductAdapter.ProductViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.adapter.ProductAdapter.ProductViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/bazar1177s/adapter/ProductAdapter$ProductViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/bazar1177s/databinding/ItemShoppingCartBinding;", "(Lcom/example/bazar1177s/adapter/ProductAdapter;Lcom/example/bazar1177s/databinding/ItemShoppingCartBinding;)V", "bind", "", "app_debug"})
    public final class ProductViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.bazar1177s.databinding.ItemShoppingCartBinding binding = null;
        
        public ProductViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.bazar1177s.databinding.ItemShoppingCartBinding binding) {
            super(null);
        }
        
        public final void bind() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/bazar1177s/adapter/ProductAdapter$Companion;", "", "()V", "ITEM_DIF", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/bazar1177s/model/Product;", "getITEM_DIF", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.bazar1177s.model.Product> getITEM_DIF() {
            return null;
        }
    }
}