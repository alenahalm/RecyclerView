package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val planetsList = arrayListOf<String>("Mars", "Venus", "Earth")
    // TODO: реализовать генерацию цветов определённой палитры

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val colorsArray = resources.getIntArray(R.array.colors)
        val colorsList = mutableListOf<Int>()

        for (color in colorsArray) {
            colorsList += color
        }

        val rv = findViewById<RecyclerView>(R.id.rview)
        val colorAdapter = ColorAdapter(LayoutInflater.from(this))

        colorAdapter.submitList(colorsList)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = colorAdapter

    }
}