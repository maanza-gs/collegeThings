package com.example.fillforms

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val display=findViewById<TextView>(R.id.tv1)
        val name=intent.getStringExtra("fname")
        val msg="Hello , you are successfully registered with us!"
        display.text=msg

    }
}