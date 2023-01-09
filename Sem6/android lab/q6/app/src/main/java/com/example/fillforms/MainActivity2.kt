package com.example.fillforms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.fillforms.R

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val display=findViewById<TextView>(R.id.tv1)
        val name=intent.getStringExtra("fname")
        val msg="hello $name , you are successfully registered"
        display.text=msg
    }
}