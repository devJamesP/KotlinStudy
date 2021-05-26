package com.devjamesp.testparcelableactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SubActivity : AppCompatActivity() {
    private val tvData: TextView by lazy {
        findViewById(R.id.tvData)
    }
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val bundle = intent.getBundleExtra("myBundle")
        var person = bundle?.getParcelable<Person>("selected_person") ?: Person("null", 10)

        tvData.text = "name: ${person.name}, age: ${person.age}"
        Log.d("testt", "person.name: ${person.name}, person.age: ${person.age}")
    }
}