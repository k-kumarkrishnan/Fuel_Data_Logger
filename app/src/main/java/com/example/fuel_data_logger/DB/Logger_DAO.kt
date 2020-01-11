package com.example.fuel_data_logger.DB

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


@Dao
interface Logger_DAO {
    //Add new car
    @Insert
    fun saveCar(cardata: Logger_Entity)

    //Reading car data
    @Query ("select * from car_detail")
    fun readAllCarData() : List<Logger_Entity>
}


@Dao
interface Fuel_Logger_DAO{
    //Add Fuel data
    @Insert
    fun saveFuelData(fuel_Data : Fuel_data_Entity)

    @Query ("select * from Fuel_data_Entity")
    fun readAllFuelData() : List<Fuel_data_Entity>
}