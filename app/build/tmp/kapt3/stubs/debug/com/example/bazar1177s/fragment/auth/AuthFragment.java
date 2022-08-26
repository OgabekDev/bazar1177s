package com.example.bazar1177s.fragment.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"H\u0002J\u001a\u0010#\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006&"}, d2 = {"Lcom/example/bazar1177s/fragment/auth/AuthFragment;", "Landroidx/fragment/app/Fragment;", "()V", "TAG", "", "binding", "Lcom/example/bazar1177s/databinding/FragmentAuthBinding;", "getBinding", "()Lcom/example/bazar1177s/databinding/FragmentAuthBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "pref", "Lcom/example/bazar1177s/data/pref/AppPref;", "getPref", "()Lcom/example/bazar1177s/data/pref/AppPref;", "setPref", "(Lcom/example/bazar1177s/data/pref/AppPref;)V", "user", "Lcom/example/bazar1177s/model/LoginUser;", "getUser", "()Lcom/example/bazar1177s/model/LoginUser;", "setUser", "(Lcom/example/bazar1177s/model/LoginUser;)V", "viewModel", "Lcom/example/bazar1177s/viewmodel/AuthViewModel;", "getViewModel", "()Lcom/example/bazar1177s/viewmodel/AuthViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "checkPermissions", "", "getAccessToken", "initViews", "view", "Landroid/view/View;", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AuthFragment extends androidx.fragment.app.Fragment {
    @javax.inject.Inject()
    public com.example.bazar1177s.data.pref.AppPref pref;
    private final java.lang.String TAG = "AuthFragment";
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private com.example.bazar1177s.model.LoginUser user;
    
    public AuthFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.bazar1177s.data.pref.AppPref getPref() {
        return null;
    }
    
    public final void setPref(@org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.data.pref.AppPref p0) {
    }
    
    private final com.example.bazar1177s.databinding.FragmentAuthBinding getBinding() {
        return null;
    }
    
    private final com.example.bazar1177s.viewmodel.AuthViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.bazar1177s.model.LoginUser getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.model.LoginUser p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getAccessToken() {
    }
    
    private final void checkPermissions() {
    }
    
    private final void initViews(android.view.View view) {
    }
}