package com.devjamesp.testparcelableactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val person = Person("박지훈", 100)
        val intent = Intent(this, SubActivity::class.java)
        var bundle = Bundle()
        bundle.putParcelable("selected_person", person)
        intent.putExtra("myBundle", bundle)
        startActivity(intent)
    }
}