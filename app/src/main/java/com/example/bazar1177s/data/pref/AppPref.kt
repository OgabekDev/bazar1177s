package com.example.bazar1177s.data.pref

import android.content.Context
import android.content.SharedPreferences
import com.example.bazar1177s.utils.Constants
import com.google.gson.Gson
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppPref @Inject constructor(@ApplicationContext context: Context) {

    private val pref: SharedPreferences =
        context.getSharedPreferences("Bazar1177", Context.MODE_PRIVATE)


    var token: String
        set(value) = pref.edit().putString("token",value).apply()
        get() = pref.getString("token", "")!!

    var refreshToken: String
        set(value) = pref.edit().putString("refreshToken",value).apply()
        get() = pref.getString("refreshToken", "")!!
    var fullName: String
        set(value) = pref.edit().putString("fullName",value).apply()
        get() = pref.getString("fullName", "")!!
    var phoneNumber: String
        set(value) = pref.edit().putString("phoneNumber",value).apply()
        get() = pref.getString("phoneNumber", "")!!

}