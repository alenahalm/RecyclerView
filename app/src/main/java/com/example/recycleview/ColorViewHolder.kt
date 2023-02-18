package com.example.recycleview

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ColorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val tv = itemView.findViewById<TextView>(R.id.color)

    // TODO: добавить обработку нажатия на элемент списка (вывести Toast с кодом цвета)
    // совет: использовать блок init { }

    init {
        itemView.setOnClickListener {
            Toast.makeText(itemView.context, tv.text, Toast.LENGTH_SHORT).show()
        }
    }

    fun bindTo(color: Int) {
        tv.setBackgroundColor(color)
        tv.text = itemView.context.getString(R.string.template, color)
    }
}