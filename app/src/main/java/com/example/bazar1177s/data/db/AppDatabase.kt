package com.example.bazar1177s.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.bazar1177s.model.OrderedProducts
import com.example.bazar1177s.model.Product1


@Database(entities = [Product1::class,OrderedProducts::class], version = 1, exportSchema = false)
abstract class AppDatabase :RoomDatabase(){
    abstract fun getProductDao():ProductDao

    companion object{
        @Volatile
        private var DB_INSTANCE:AppDatabase? = null

        fun getAppDBInstance(context: Context):AppDatabase{
            if (DB_INSTANCE == null){
                DB_INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "database"
                ).allowMainThreadQueries()
                    .build()
            }
            return DB_INSTANCE!!
        }
    }
}