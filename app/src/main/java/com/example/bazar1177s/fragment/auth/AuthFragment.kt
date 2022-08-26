package com.example.bazar1177s.fragment.auth

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.bazar1177s.R
import com.example.bazar1177s.data.pref.AppPref
import com.example.bazar1177s.databinding.FragmentAuthBinding
import com.example.bazar1177s.model.LoginUser
import com.example.bazar1177s.utils.TextWatcherWrapper
import com.example.bazar1177s.utils.UiStateObject
import com.example.bazar1177s.viewmodel.AuthViewModel
import com.example.bazar1177s.viewmodel.LoginState
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.PhoneAuthProvider
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject


@AndroidEntryPoint
class AuthFragment : Fragment(R.layout.fragment_auth) {
    @Inject
    lateinit var pref: AppPref
    private val TAG = "AuthFragment"

    private val binding by viewBinding(FragmentAuthBinding::bind)
    private val viewModel: AuthViewModel by viewModels()
    var user = LoginUser("", "")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        checkPermissions()
        getAccessToken()
        initViews(view)
    }

    private fun getAccessToken() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.loginApiState.collect {
                    when (it) {
                        is UiStateObject.LOADING -> {
                            binding.progressBar.visibility = View.VISIBLE
                        }
                        is UiStateObject.SUCCESS -> {
                            binding.progressBar.visibility = View.GONE
                            Log.d(TAG, "getAccessToken: ${it.data}")
                            pref.fullName = user.firstName
                            pref.phoneNumber = user.phoneNumber
                            pref.token = it.data.accessToken
                            pref.refreshToken = it.data.refreshToken

                            Log.d("TOKEN", "getAccessToken: ${it.data.accessToken}")

                            Toast.makeText(requireContext(), it.data.accessToken, Toast.LENGTH_SHORT).show()

                            findNavController().navigate(R.id.action_authFragment_to_homeFragment)

                        }
                        is UiStateObject.ERROR -> {

                        }
                        else -> Unit
                    }
                }
            }
        }
    }

    private fun checkPermissions() {
        if (ActivityCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.READ_CALL_LOG
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                requireActivity(),
                Array(1) { Manifest.permission.READ_CALL_LOG },
                101
            )
        } else {
// try to get permissions
        }
    }

    private fun initViews(view: View) {
        val textWatcherWrapper = object : TextWatcherWrapper() {
            override fun afterTextChanged(s: Editable) {
                super.afterTextChanged(s)
                if (s.length == 6) {
                    Log.d(TAG, "afterTextChanged: $s")
                    viewModel.verifyCode(binding.etVerificationCode.text.toString())
                }
            }
        }
        binding.btnSendCode.setOnClickListener {
//            viewModel.verifyPhoneNumber(
//                binding.etPhoneNumber.text.toString(),
//                requireActivity()
//            )
//
//            viewModel.loginState.observe(viewLifecycleOwner) { state ->
//                when (state) {
//                    LoginState.CodeSent -> {
//                        binding.flLogin.visibility = View.GONE
//                        binding.flSmsConfirm.visibility = View.VISIBLE
//                        binding.etVerificationCode.addTextChangedListener(textWatcherWrapper)
//
//
//                    }
//                    is LoginState.Error -> {
//                        binding.progressBar.visibility = View.GONE
//                        Snackbar.make(view, state.msg, Snackbar.LENGTH_SHORT).show()
//
//                        viewModel.resendVerificationCode(
//                            binding.etPhoneNumber.text.toString(),
//                            requireActivity(),
//                            PhoneAuthProvider.ForceResendingToken.zza()
//                        )
//
//                    }
//
//                    LoginState.Loading -> {
//                        binding.progressBar.visibility = View.VISIBLE
//                    }
//                    LoginState.ErrorVerify -> {
//                        binding.progressBar.visibility = View.GONE
//                        Snackbar.make(
//                            view,
//                            "Tasdiqlash kodini xato kiritdingiz. Qaytadan urinib ko`ring!",
//                            Snackbar.LENGTH_SHORT
//                        ).show()
//                        binding.etVerificationCode.text?.clear()
//                        binding.etVerificationCode.addTextChangedListener(textWatcherWrapper)
//                    }
//
//                    LoginState.Success -> {
//                        binding.progressBar.visibility = View.GONE
//
//                        Log.d(TAG, "initViews: State succes")
//                        user = LoginUser(
//                            binding.etFullName.text.toString(),
//                            binding.etPhoneNumber.text.toString()
//                        )
//                        Log.d(TAG, "initViews: ${user}")
//                        viewModel.getToken(user)
//                        Log.d(TAG, "initViews: code reached here")
//                        //request token
//                    }
//
//                }
//            }

            binding.progressBar.visibility = View.GONE

            Log.d(TAG, "initViews: State succes")
            user = LoginUser(
                binding.etFullName.text.toString(),
                binding.etPhoneNumber.text.toString()
            )
            Log.d(TAG, "initViews: ${user}")
            viewModel.getToken(user)
            Log.d(TAG, "initViews: code reached here")
            //request token

        }

    }

}





