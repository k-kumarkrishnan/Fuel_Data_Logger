package com.example.fuel_data_logger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fuel_data_logger.Globals.Temples


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        //>>>>>>>>>>>>>>>.  Car List Recycler View <<<<<<<<<<<<<<<<<<<<<<<<
        val Car_List_Rview = findViewById<RecyclerView>(R.id.main_car_list)
        Car_List_Rview.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL,false)
        Car_List_Rview.adapter = Car_List_Adapter(Temples, this)



    }
}
