package com.example.emoji

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val submitBtn = findViewById<Button>(R.id.submitBtn)
        var fTemp = findViewById<TextView>(R.id.fTemp)
        var cTemp = findViewById<TextView>(R.id.cTemp)
        submitBtn.setOnClickListener {
            val fval = fTemp.text.toString()
            val cval = cTemp.text.toString()
            if (fval == "" && cval == "") {
                Toast.makeText(this, "Enter at least one value!", Toast.LENGTH_SHORT).show()
            } else if (fval.toString() != "") {
                var cel = (fval.toInt() - 32) * 5 / 9
                cTemp.text = cel.toString()
            } else {
                var f = (cval.toInt() * 9 / 5) + 32
                fTemp.text = f.toString()
            }
        }
    }
}