package com.example.labtest

import android.content.Intent
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val name = findViewById<EditText>(R.id.name)
        val phno = findViewById<EditText>(R.id.mobNum);
        val cap = findViewById<TextView>(R.id.captchaField);
        val capuser = findViewById<EditText>(R.id.userInpField);
        val submitBtn = findViewById<Button>(R.id.submit);

        cap.apply {
            paintFlags = paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
            text = randomAlphanumericString();
        }
        submitBtn.setOnClickListener {
            if (phno.text.toString().matches(Regex("^([+]\\d{2})?\\d{10}\$"))) {
                val intent: Intent = Intent(applicationContext, MainActivity3::class.java);
                println(capuser.text.toString() + "AND" + cap.text.toString());
                if(capuser.text.toString() == cap.text.toString()) {
                    intent.putExtra("phno", phno.text.toString());
                    intent.putExtra("captcha", "verified");
                    startActivity(intent);
                } else {
                    Toast.makeText(applicationContext, "Wrong Captcha.", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(applicationContext, "Invalid Mobile Number.", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private fun randomAlphanumericString(): String {
        val charPool: List<Char> = ('0'..'9') + ('0'..'9')

        return (1..6)
            .map{ kotlin.random.Random.nextInt(0, charPool.size) }
            .map(charPool::get)
            .joinToString("")
    }
}