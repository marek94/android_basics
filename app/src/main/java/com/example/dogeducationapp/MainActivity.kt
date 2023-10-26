package com.example.dogeducationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextButton = findViewById<Button>(R.id.next_activity)

        nextButton.setOnClickListener {
            // use explicit intent to start new activity
            val intent = Intent(this, SecondActivity::class.java)

            // start activity with a newly created intent
            startActivity(intent)
        }
    }
}