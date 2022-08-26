package com.example.bazar1177s.di

import android.util.Log
import com.example.bazar1177s.data.pref.AppPref
import com.example.bazar1177s.network.ProductService
import com.example.bazar1177s.utils.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ServerModule {
    @Provides
    @Singleton
    @Named("Normal")
    fun getRetrofit(client: OkHttpClient): Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Provides
    fun getProductService(@Named("Normal") retrofit: Retrofit): ProductService =
        retrofit.create(ProductService::class.java)

    @Provides
    @Singleton
    fun getClient(pref: AppPref): OkHttpClient = OkHttpClient.Builder()
        .connectTimeout( 60, TimeUnit.SECONDS)
        .readTimeout(60, TimeUnit.SECONDS)
        //   .addInterceptor(ChuckInterceptor(context))
        .addInterceptor(HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        })
        .addInterceptor(Interceptor { chain ->
            val builder = chain.request().newBuilder()
            Log.d("TAG", "getClient: p${pref.token}")
            if (pref.token != ""){
                builder.header("Authorization","Bearer ${pref.token}")
            }
            chain.proceed(builder.build())
        })
        .build()
}