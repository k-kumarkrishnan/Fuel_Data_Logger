package com.example.fuel_data_logger

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout.view.*

class Car_List_Adapter (val cars_List : List<String>, val received_context : Context) : RecyclerView.Adapter<Car_List_Adapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return cars_List.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.car_name.text = cars_List[position]
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val car_name = view.Car_Name
    }
}