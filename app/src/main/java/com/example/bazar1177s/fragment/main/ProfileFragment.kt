package com.example.bazar1177s.fragment.main

import android.Manifest
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.bazar1177s.R
import com.example.bazar1177s.data.pref.AppPref
import com.example.bazar1177s.databinding.FragmentProfileBinding
import com.karumi.dexter.Dexter
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionDeniedResponse
import com.karumi.dexter.listener.PermissionGrantedResponse
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.single.PermissionListener
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ProfileFragment: Fragment(R.layout.fragment_profile) {
    @Inject
    lateinit var pref: AppPref
    private val binding by viewBinding(FragmentProfileBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initVIews()
    }

    private fun initVIews() {
        binding.callingSeller.setOnClickListener {
            callToOwner("+998915064758")
        }
        binding.tvFullnameEditProfile.text = pref.fullName
        binding.tvNumberEditProfile.text = pref.phoneNumber

        binding.btnLogout.setOnClickListener {
            pref.token = ""
            findNavController().navigate(R.id.action_profileFragment_to_authFragment)
        }

        binding.llHistory.setOnClickListener {
            Toast.makeText(requireContext(),"History is not available in this version of app. Please update the app", Toast.LENGTH_SHORT).show()
        }

    }

    private fun callToOwner(phone: String) {
        val callIntent = Intent(Intent.ACTION_CALL)
        callIntent.data = Uri.parse("tel:$phone") //change the number
        Log.d("!!!", "callToOwner")
        Dexter.withContext(requireContext())
            .withPermission(Manifest.permission.CALL_PHONE)
            .withListener(object : PermissionListener {
                override fun onPermissionGranted(p0: PermissionGrantedResponse?) {
                    startActivity(callIntent)
                    Log.d("!!!", "callToOwner1")
                }

                override fun onPermissionDenied(p0: PermissionDeniedResponse?) {
                }

                override fun onPermissionRationaleShouldBeShown(
                    p0: PermissionRequest?,
                    p1: PermissionToken?
                ) {
                    p1!!.continuePermissionRequest()
                    Log.d("!!!", "callToOwner2")
                }

            }).check()
    }
}