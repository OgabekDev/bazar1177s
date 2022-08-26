package com.example.bazar1177s.di

import android.app.Application
import com.example.bazar1177s.data.db.AppDatabase
import com.example.bazar1177s.data.db.ProductDao
import com.example.bazar1177s.network.ProductService
import com.example.bazar1177s.network.Server
import com.example.bazar1177s.network.Server.IS_TESTER
import com.example.bazar1177s.utils.Constants.BASE_URL
import com.google.firebase.auth.FirebaseAuth
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideFirebaseAuth(): FirebaseAuth = FirebaseAuth.getInstance()


    @Provides
    fun server(): String {
        if (IS_TESTER) return BASE_URL
        return BASE_URL
    }


    @Provides
    @Singleton
    fun appDatabase(context: Application): AppDatabase {
        return AppDatabase.getAppDBInstance(context)
    }

    @Provides
    @Singleton
    fun tvShowDao(appDatabase: AppDatabase): ProductDao {
        return appDatabase.getProductDao()
    }
}