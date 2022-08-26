package com.example.bazar1177s.fragment.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 82\u00020\u0001:\u00018B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010*\u001a\u00020+H\u0002J\u0012\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020+H\u0016J\b\u00100\u001a\u00020+H\u0016J\u001a\u00101\u001a\u00020+2\u0006\u00102\u001a\u0002032\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u00104\u001a\u00020+H\u0002J\b\u00105\u001a\u00020+H\u0002J\b\u00106\u001a\u00020+H\u0002J\b\u00107\u001a\u00020+H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\u0010\u001a\u0004\b\u001e\u0010\u001fR\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\u0010\u001a\u0004\b\'\u0010(\u00a8\u00069"}, d2 = {"Lcom/example/bazar1177s/fragment/main/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "TAG", "", "binding", "Lcom/example/bazar1177s/databinding/FragmentHomeBinding;", "getBinding", "()Lcom/example/bazar1177s/databinding/FragmentHomeBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "carouselAdapter", "Lcom/example/bazar1177s/adapter/CarouselAdapter;", "getCarouselAdapter", "()Lcom/example/bazar1177s/adapter/CarouselAdapter;", "carouselAdapter$delegate", "Lkotlin/Lazy;", "discountAdapter", "Lcom/example/bazar1177s/adapter/DiscountAdapter;", "getDiscountAdapter", "()Lcom/example/bazar1177s/adapter/DiscountAdapter;", "discountAdapter$delegate", "layoutManagerBanner", "Landroidx/recyclerview/widget/LinearLayoutManager;", "position", "", "rvMainAds", "Landroidx/recyclerview/widget/RecyclerView;", "shopAdapter", "Lcom/example/bazar1177s/adapter/ShopAdapter;", "getShopAdapter", "()Lcom/example/bazar1177s/adapter/ShopAdapter;", "shopAdapter$delegate", "timer", "Ljava/util/Timer;", "timerTask", "Ljava/util/TimerTask;", "viewModel", "Lcom/example/bazar1177s/viewmodel/MainViewModel;", "getViewModel", "()Lcom/example/bazar1177s/viewmodel/MainViewModel;", "viewModel$delegate", "initViews", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onViewCreated", "view", "Landroid/view/View;", "runAutoScrollBanner", "setUpBanners", "setUpObservers", "stopAutoScrollBanner", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeFragment extends androidx.fragment.app.Fragment {
    private final java.lang.String TAG = "HomeFragment";
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy shopAdapter$delegate = null;
    private final kotlin.Lazy carouselAdapter$delegate = null;
    private final kotlin.Lazy discountAdapter$delegate = null;
    private androidx.recyclerview.widget.LinearLayoutManager layoutManagerBanner;
    private androidx.recyclerview.widget.RecyclerView rvMainAds;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.bazar1177s.fragment.main.HomeFragment.Companion Companion = null;
    public static final long DELAY_MS = 2500L;
    public static final long PERIOD_MS = 5000L;
    private java.util.Timer timer;
    private java.util.TimerTask timerTask;
    private int position = 0;
    
    public HomeFragment() {
        super();
    }
    
    private final com.example.bazar1177s.databinding.FragmentHomeBinding getBinding() {
        return null;
    }
    
    private final com.example.bazar1177s.viewmodel.MainViewModel getViewModel() {
        return null;
    }
    
    private final com.example.bazar1177s.adapter.ShopAdapter getShopAdapter() {
        return null;
    }
    
    private final com.example.bazar1177s.adapter.CarouselAdapter getCarouselAdapter() {
        return null;
    }
    
    private final com.example.bazar1177s.adapter.DiscountAdapter getDiscountAdapter() {
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
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    private final void setUpObservers() {
    }
    
    private final void initViews() {
    }
    
    private final void setUpBanners() {
    }
    
    private final void runAutoScrollBanner() {
    }
    
    private final void stopAutoScrollBanner() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/bazar1177s/fragment/main/HomeFragment$Companion;", "", "()V", "DELAY_MS", "", "PERIOD_MS", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}