package com.example.bazar1177s.viewmodel

import android.app.Activity
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bazar1177s.model.LoginResponse
import com.example.bazar1177s.model.LoginUser
import com.example.bazar1177s.repository.AuthRepository
import com.example.bazar1177s.utils.UiStateObject
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.FirebaseException
import com.google.firebase.auth.*
import com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.util.concurrent.TimeUnit
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val authRepository: AuthRepository,
    private val firebaseAuth: FirebaseAuth,
) : ViewModel() {
    private val TAG = "AuthViewModel"
    
    
    private val _loginState = MutableLiveData<LoginState>()
    val loginState: LiveData<LoginState> = _loginState


    var storedVerificationId: String? = null
    var resendToken: ForceResendingToken? = null


    private val callback = object : PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
        override fun onVerificationCompleted(phoneAuthCredential: PhoneAuthCredential) {
            viewModelScope.launch {
                signInWithCredential(phoneAuthCredential)
            }
        }

        override fun onCodeSent(
            verificationId: String,
            token: PhoneAuthProvider.ForceResendingToken
        ) {
            storedVerificationId = verificationId
            Log.d(TAG, "onCodeSent: $token")
            resendToken = token
            _loginState.value = LoginState.CodeSent
        }

        override fun onVerificationFailed(p0: FirebaseException) {
            Log.d(TAG, "$p0")
            _loginState.postValue(LoginState.Error(p0.message ?: "Error"))
        }

        override fun onCodeAutoRetrievalTimeOut(p0: String) {
            super.onCodeAutoRetrievalTimeOut(p0)
        }

    }

    fun verifyPhoneNumber(phone: String, activity: Activity) {
        val options = PhoneAuthOptions.newBuilder(firebaseAuth)
            .setPhoneNumber(phone)
            .setTimeout(60L, TimeUnit.SECONDS)
            .setActivity(activity)
            .setCallbacks(callback)
            .build()
        Log.d(TAG, "verifyPhoneNumber: verifying")
        PhoneAuthProvider.verifyPhoneNumber(options)
    }

    fun resendVerificationCode(phoneNumber: String, activity: Activity, token: ForceResendingToken) {
         Log.d(TAG, "resendVerificationCode: $resendToken")
        val options = PhoneAuthOptions.newBuilder(firebaseAuth)
            .setPhoneNumber(phoneNumber) // Phone number to verify
            .setTimeout(60L, TimeUnit.SECONDS) // Timeout and unit
            .setActivity(activity) // Activity (for callback binding)
            .setCallbacks(callback) // OnVerificationStateChangedCallbacks
            .setForceResendingToken(token) // ForceResendingToken from callbacks
            .build()
        PhoneAuthProvider.verifyPhoneNumber(options)
    }

    fun verifyCode(code: String) {
        Log.d(TAG, "verifyCode:storedVerificationId $storedVerificationId")
        Log.d(TAG, "verifyCode: code $code")
        val credential = PhoneAuthProvider.getCredential(storedVerificationId!!, code)
        signInWithCredential(credential)
    }

    private fun signInWithCredential(credential: PhoneAuthCredential) {
        firebaseAuth.signInWithCredential(credential)
            .addOnCompleteListener() { task ->
                if (task.isSuccessful) {
                    Log.d(TAG, "signInWithCredential: Signed in successfully")
                    _loginState.value = LoginState.Success
                } else {
                    if (task.exception is FirebaseAuthInvalidCredentialsException) {
                        // The verification code entered was invalid
                        _loginState.value = LoginState.ErrorVerify
                    }
                }
            }
    }

    private val _loginApiState = MutableStateFlow<UiStateObject<LoginResponse>>(UiStateObject.EMPTY)
    val loginApiState: StateFlow<UiStateObject<LoginResponse>> = _loginApiState

    fun getToken(user: LoginUser) = viewModelScope.launch {
        _loginApiState.value = UiStateObject.LOADING
        try {
            val response = authRepository.login(user)
//            Log.d(TAG, "getToken1: ${response.data.accessToken}")
//            if (response.ok) {
//                Log.d(TAG, "getToken2: ${token}")
//                token = response.data
                _loginApiState.value = UiStateObject.SUCCESS(response)
//            }else{
////                Log.d(TAG, "getToken3: response is not ok")
//                _loginApiState.value = UiStateObject.ERROR(response.error)
//            }
        } catch (e: Exception) {
            Log.d(TAG, "getToken4: exception occured")
            _loginApiState.value = UiStateObject.ERROR(e.localizedMessage ?: "No Connection")
        }
    }


}

sealed class LoginState {
    object Loading : LoginState()
    object ErrorVerify : LoginState()
    data class Error(val msg: String) : LoginState()
    object CodeSent : LoginState()
    object Success : LoginState()
}