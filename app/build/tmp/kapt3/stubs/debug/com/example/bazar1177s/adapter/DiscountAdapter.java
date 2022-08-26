package com.example.bazar1177s.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001b2\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u001b\u001cB\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0014\u001a\u00020\u000f2\n\u0010\u0015\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\bH\u0016J\u001c\u0010\u0017\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001d"}, d2 = {"Lcom/example/bazar1177s/adapter/DiscountAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/bazar1177s/model/DiscountProduct;", "Lcom/example/bazar1177s/adapter/DiscountAdapter$DiscountProductViewHolder;", "()V", "TAG", "", "count", "", "getCount", "()I", "setCount", "(I)V", "onClick", "Lkotlin/Function1;", "", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "setOnClick", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "DiscountProductViewHolder", "app_debug"})
public final class DiscountAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.bazar1177s.model.DiscountProduct, com.example.bazar1177s.adapter.DiscountAdapter.DiscountProductViewHolder> {
    private final java.lang.String TAG = "CarouselProductAdapter";
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClick;
    private int count = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.bazar1177s.adapter.DiscountAdapter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.bazar1177s.model.DiscountProduct> ITEM_DIF = null;
    
    public DiscountAdapter() {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getOnClick() {
        return null;
    }
    
    public final void setOnClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    public final int getCount() {
        return 0;
    }
    
    public final void setCount(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.bazar1177s.adapter.DiscountAdapter.DiscountProductViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.adapter.DiscountAdapter.DiscountProductViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/bazar1177s/adapter/DiscountAdapter$DiscountProductViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/bazar1177s/databinding/ItemDiscountBinding;", "(Lcom/example/bazar1177s/adapter/DiscountAdapter;Lcom/example/bazar1177s/databinding/ItemDiscountBinding;)V", "bind", "", "app_debug"})
    public final class DiscountProductViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.bazar1177s.databinding.ItemDiscountBinding binding = null;
        
        public DiscountProductViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.bazar1177s.databinding.ItemDiscountBinding binding) {
            super(null);
        }
        
        public final void bind() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/bazar1177s/adapter/DiscountAdapter$Companion;", "", "()V", "ITEM_DIF", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/bazar1177s/model/DiscountProduct;", "getITEM_DIF", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.bazar1177s.model.DiscountProduct> getITEM_DIF() {
            return null;
        }
    }
}