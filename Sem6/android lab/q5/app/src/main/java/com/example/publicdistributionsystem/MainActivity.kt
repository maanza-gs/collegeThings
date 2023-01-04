package com.example.publicdistributionsystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private fun randomAlphanumericString(): String {
        val charPool: List<Char> = ('0'..'9') + ('0'..'9')

        return (1..6)
            .map{ kotlin.random.Random.nextInt(0, charPool.size) }
            .map(charPool::get)
            .joinToString("")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ph = findViewById<EditText>(R.id.phno)
        val submitBtn = findViewById<Button>(R.id.button)
        var cap = findViewById<EditText>(R.id.captchaSpace)
        var capEn = findViewById<EditText>(R.id.captchaEnter)
        var captcha = randomAlphanumericString()
        cap.setText(captcha)

        submitBtn.setOnClickListener {
            if (capEn.text == cap.text) {
                submitBtn.setOnClickListener() {
                    Toast.makeText(
                        applicationContext,
                        "Submitted Successfully!",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }


    }
}