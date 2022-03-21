package com.example.activitytoactivityexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.ActionBar

//현재 AppBar가 없는데 이걸 어떻게 찾을 수가 있나?????????
class MainActivity : AppCompatActivity() {
    private lateinit var activity1_button : Button
    private lateinit var actionBar : ActionBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        actionBar = supportActionBar.also { title = "Activity1" }!!
        activity1_button = findViewById(R.id.activity1_button)
        activity1_button.setOnClickListener(View.OnClickListener {
            OpenActivity()
        })
    }

    private fun OpenActivity() {
        val intent : Intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}