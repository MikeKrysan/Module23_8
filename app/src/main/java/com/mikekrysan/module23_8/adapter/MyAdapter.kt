package com.mikekrysan.module23_8.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mikekrysan.module23_8.R

//class MyAdapter(val data: ArrayList<Fruit>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
class MyAdapter : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
//    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val icon = itemView.icon
//        val text_name = itemView.text_name
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
//        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false))
//    }
//
//    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//        holder.icon.setImageResource(data[position].idIcon)
//        holder.text_name.text = data[position].name
//    }
//
//    override fun getItemCount(): Int {
//        return data.size
//    }

    //Создадим адаптер, который будет устанавливать цвет фона и позицию в текстовое поле
    val colors = arrayOf(Color.RED, Color.GREEN, Color.BLUE, Color.WHITE, Color.YELLOW)

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textView = itemView.findViewById<TextView>(R.id.text_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.page, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.setBackgroundColor(colors[position])
        holder.textView.text = "${position + 1}"
    }

    override fun getItemCount(): Int {
        return colors.size
    }


}