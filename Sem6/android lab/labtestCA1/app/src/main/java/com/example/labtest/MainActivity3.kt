package com.example.labtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    private lateinit var timerView: TextView
    private var timerCounter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val timerView = findViewById<TextView>(R.id.timer)
        startTimer()
    }
    private fun startTimer() {
        val handler = Handler()
        val runnable = object : Runnable {
            override fun run() {
                timerCounter++
                val hours = timerCounter / 3600
                val minutes = (timerCounter % 3600) / 60
                val seconds = timerCounter % 60
                timerView.text = "Timer: %02d:%02d:%02d".format(hours, minutes, seconds)
                handler.postDelayed(this, 1000)
            }
        }
        handler.post(runnable)
    }
}