package com.devjamesp.recyclerviewactivity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val petList = arrayListOf<Pet>(
        Pet("British Shorthair", "Male", "4", ""),
        Pet("British Shorthair", "Male", "4", ""),
        Pet("British Shorthair", "Male", "4", ""),
        Pet("British Shorthair", "Male", "4", "birtish_shorthair"),
        Pet("British Shorthair", "Male", "4", "birtish_shorthair"),
        Pet("British Shorthair", "Male", "4", "birtish_shorthair"),
        Pet("British Shorthair", "Male", "4", "birtish_shorthair"),
        Pet("British Shorthair", "Male", "4", "birtish_shorthair"),
        Pet("British Shorthair", "Male", "4", "birtish_shorthair"),
        Pet("British Shorthair", "Male", "4", "birtish_shorthair"),

    )

    private val rcvTest: RecyclerView by lazy {
        findViewById(R.id.rcvTest)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {
        rcvTest.apply {
            adapter  = RecyclerViewAdapter(petList,
                context) {
                Toast.makeText(applicationContext, "Breed: ${it.breed}, Age: ${it.age}",Toast.LENGTH_SHORT).show()
            }
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }


}