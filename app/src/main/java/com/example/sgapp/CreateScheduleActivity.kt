package com.example.sgapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class CreateScheduleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_schedule)
        var backButton = findViewById<ImageView>(R.id.back_button)
        backButton.setOnClickListener{
            finish()
        }

    }
}