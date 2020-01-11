package com.example.fuel_data_logger.DB

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized
import java.time.Instant

@Database (entities = [Fuel_data_Entity::class, Logger_Entity::class], version = 1)
abstract class Fuel_Logger_Database : RoomDatabase() {

    abstract fun car_Logger_db() : Logger_DAO
    abstract fun fuel_log_db() : Fuel_Logger_DAO

    companion object{
        private var INSTANCE : Fuel_Logger_Database? = null

        @InternalCoroutinesApi
        fun getInstance(context: Context) : Fuel_Logger_Database?
        {
            if(INSTANCE == null)
            {
                synchronized(Fuel_Logger_Database::class){
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                        Fuel_Logger_Database::class.java, "Fuel_Logger_DB.db")
                        .build()
                }
            }
            return INSTANCE
        }
    }
}