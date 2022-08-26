package com.example.bazar1177s.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(J\u001e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u001bJ\u0010\u0010/\u001a\u00020*2\u0006\u00100\u001a\u000201H\u0002J\u000e\u00102\u001a\u00020*2\u0006\u00103\u001a\u00020\bJ\u0016\u00104\u001a\u00020*2\u0006\u00105\u001a\u00020\b2\u0006\u0010,\u001a\u00020-R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u00066"}, d2 = {"Lcom/example/bazar1177s/viewmodel/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "authRepository", "Lcom/example/bazar1177s/repository/AuthRepository;", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "(Lcom/example/bazar1177s/repository/AuthRepository;Lcom/google/firebase/auth/FirebaseAuth;)V", "TAG", "", "_loginApiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/bazar1177s/utils/UiStateObject;", "Lcom/example/bazar1177s/model/LoginResponse;", "_loginState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/bazar1177s/viewmodel/LoginState;", "callback", "Lcom/google/firebase/auth/PhoneAuthProvider$OnVerificationStateChangedCallbacks;", "loginApiState", "Lkotlinx/coroutines/flow/StateFlow;", "getLoginApiState", "()Lkotlinx/coroutines/flow/StateFlow;", "loginState", "Landroidx/lifecycle/LiveData;", "getLoginState", "()Landroidx/lifecycle/LiveData;", "resendToken", "Lcom/google/firebase/auth/PhoneAuthProvider$ForceResendingToken;", "getResendToken", "()Lcom/google/firebase/auth/PhoneAuthProvider$ForceResendingToken;", "setResendToken", "(Lcom/google/firebase/auth/PhoneAuthProvider$ForceResendingToken;)V", "storedVerificationId", "getStoredVerificationId", "()Ljava/lang/String;", "setStoredVerificationId", "(Ljava/lang/String;)V", "getToken", "Lkotlinx/coroutines/Job;", "user", "Lcom/example/bazar1177s/model/LoginUser;", "resendVerificationCode", "", "phoneNumber", "activity", "Landroid/app/Activity;", "token", "signInWithCredential", "credential", "Lcom/google/firebase/auth/PhoneAuthCredential;", "verifyCode", "code", "verifyPhoneNumber", "phone", "app_debug"})
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.bazar1177s.repository.AuthRepository authRepository = null;
    private final com.google.firebase.auth.FirebaseAuth firebaseAuth = null;
    private final java.lang.String TAG = "AuthViewModel";
    private final androidx.lifecycle.MutableLiveData<com.example.bazar1177s.viewmodel.LoginState> _loginState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.bazar1177s.viewmodel.LoginState> loginState = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String storedVerificationId;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken resendToken;
    private final com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks callback = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.bazar1177s.utils.UiStateObject<com.example.bazar1177s.model.LoginResponse>> _loginApiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.bazar1177s.utils.UiStateObject<com.example.bazar1177s.model.LoginResponse>> loginApiState = null;
    
    @javax.inject.Inject()
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.repository.AuthRepository authRepository, @org.jetbrains.annotations.NotNull()
    com.google.firebase.auth.FirebaseAuth firebaseAuth) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.bazar1177s.viewmodel.LoginState> getLoginState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStoredVerificationId() {
        return null;
    }
    
    public final void setStoredVerificationId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken getResendToken() {
        return null;
    }
    
    public final void setResendToken(@org.jetbrains.annotations.Nullable()
    com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken p0) {
    }
    
    public final void verifyPhoneNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public final void resendVerificationCode(@org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken token) {
    }
    
    public final void verifyCode(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
    }
    
    private final void signInWithCredential(com.google.firebase.auth.PhoneAuthCredential credential) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.bazar1177s.utils.UiStateObject<com.example.bazar1177s.model.LoginResponse>> getLoginApiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getToken(@org.jetbrains.annotations.NotNull()
    com.example.bazar1177s.model.LoginUser user) {
        return null;
    }
}