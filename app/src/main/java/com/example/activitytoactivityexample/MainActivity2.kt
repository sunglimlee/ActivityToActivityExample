package com.example.activitytoactivityexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.ActionBar

class MainActivity2 : AppCompatActivity() {
    private lateinit var activity2_Button : Button
    private lateinit var actionBar : ActionBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        actionBar = supportActionBar.also { title = "Activity2" }!!
        actionBar.setDisplayHomeAsUpEnabled(true)
        activity2_Button = findViewById(R.id.activity2_button)
        activity2_Button.setOnClickListener {
            openActivity()
            }
        }

    private fun openActivity() {
        val intent : Intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)
    }
}
