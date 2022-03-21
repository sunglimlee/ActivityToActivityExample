package com.example.activitytoactivityexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.ActionBar

class MainActivity3 : AppCompatActivity() {
    private lateinit var activity3_Button : Button
    private lateinit var actionBar : ActionBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        actionBar = supportActionBar.also { title = "Activity3" }!!
        actionBar.setDisplayHomeAsUpEnabled(true)
        activity3_Button = findViewById(R.id.activity3_button)
        activity3_Button.setOnClickListener {
            if (this is MainActivity3) {
                onBackPressed()
            }
        }
    }
}