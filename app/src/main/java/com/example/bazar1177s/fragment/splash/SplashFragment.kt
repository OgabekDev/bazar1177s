package com.example.bazar1177s.fragment.splash

import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.bazar1177s.R
import com.example.bazar1177s.data.pref.AppPref
import com.example.bazar1177s.databinding.FragmentSplashBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SplashFragment : Fragment(R.layout.fragment_splash) {
    private val SPLASH_SCREEN = 2000
    private val binding by viewBinding(FragmentSplashBinding::bind)
    private val TAG = "SplashFragment"

    @Inject
    lateinit var pref: AppPref

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: i was in splash")
//        pref.token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI1MDkiLCJpYXQiOjE2NjAyNDI1MTgsInJvbGVzIjoiUk9MRV9VU0VSIiwiZXhwIjoxNjYwMzI4OTE4fQ.Hni4x0bsE328ZIx0NHgRqG5_XvT36pJVlo9Fl_WsZ_dFgU46aYWwdhZq_-sF6x6KOif4bJSRgl9-Q6qt7IK7xQ"
        if (pref.token != ""){
            findNavController().navigate(R.id.action_splashFragment_to_homeFragment)
        }else{
            findNavController().navigate(R.id.action_splashFragment_to_authFragment)
        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initVIews()
    }

    private fun initVIews() {
    }
}