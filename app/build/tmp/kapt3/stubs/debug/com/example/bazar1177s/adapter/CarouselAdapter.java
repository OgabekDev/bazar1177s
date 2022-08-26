package com.example.bazar1177s.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0016\u0017B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u000e\u001a\u00020\t2\n\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/example/bazar1177s/adapter/CarouselAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/bazar1177s/model/CarouselProduct;", "Lcom/example/bazar1177s/adapter/CarouselAdapter$CarouselProductViewHolder;", "()V", "TAG", "", "onClick", "Lkotlin/Function1;", "", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "setOnClick", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CarouselProductViewHolder", "Companion", "app_debug"})
public final class CarouselAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.bazar1177s.model.CarouselProduct, com.example.bazar1177s.adapter.CarouselAdapter.CarouselProductViewHolder> {
    private final java.lang.String TAG = "CarouselProductAdapter";
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.example.bazar1177s.model.CarouselProduct, kotlin.Unit> onClick;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.bazar1177s.adapter.CarouselAdapter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.bazar1177s.model.CarouselProduct> ITEM_DIF = null;
    
    public CarouselAdapter() {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.example.bazar1177s.model.CarouselProduct, kotlin.Unit> getOnClick() {
        return null;
    }
    
    public final void setOnClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.example.bazar1177s.model.CarouselProduct, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.bazar1177s.adapter.CarouselAdapter.CarouselProductViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.adapter.CarouselAdapter.CarouselProductViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/bazar1177s/adapter/CarouselAdapter$CarouselProductViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/bazar1177s/databinding/ItemMainAdsBinding;", "(Lcom/example/bazar1177s/adapter/CarouselAdapter;Lcom/example/bazar1177s/databinding/ItemMainAdsBinding;)V", "bind", "", "app_debug"})
    public final class CarouselProductViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.bazar1177s.databinding.ItemMainAdsBinding binding = null;
        
        public CarouselProductViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.bazar1177s.databinding.ItemMainAdsBinding binding) {
            super(null);
        }
        
        public final void bind() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/bazar1177s/adapter/CarouselAdapter$Companion;", "", "()V", "ITEM_DIF", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/bazar1177s/model/CarouselProduct;", "getITEM_DIF", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.bazar1177s.model.CarouselProduct> getITEM_DIF() {
            return null;
        }
    }
}