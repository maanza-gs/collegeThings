package com.example.fillforms

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_main2)
        super.onCreate(savedInstanceState)

        val button1 = findViewById<Button>(R.id.button2)
        val button2 = findViewById<Button>(R.id.button3)
        val fname = findViewById<TextView>(R.id.text1)
        val lname = findViewById<TextView>(R.id.text2)
        val emails = findViewById<TextView>(R.id.text3)
        val phno = findViewById<TextView>(R.id.text5)
        val gend = findViewById<TextView>(R.id.text6)
        val bday = findViewById<TextView>(R.id.text7)
        val adrs = findViewById<TextView>(R.id.text8)

        val first = intent.getStringExtra("fname")
        val last = intent.getStringExtra("lname")
        val email = intent.getStringExtra("email")
        val phone = intent.getStringExtra("phone")
        val gender = intent.getStringExtra("gender")
        val bdate = intent.getStringExtra("bdate")
        val address = intent.getStringExtra("address")

        fname.text=first
        lname.text=last
        emails.text=email
        phno.text=phone
        gend.text=gender
        bday.text=bdate
        adrs.text=address

        button1.setOnClickListener() {
            button1.visibility = View.VISIBLE
            val abc = Intent(this@MainActivity2, MainActivity3::class.java)
            startActivity(abc)
        }
        button2.setOnClickListener()
        {
            button2.visibility = View.VISIBLE
            val abc = Intent(this@MainActivity2, MainActivity::class.java)
            startActivity(abc)
        }
    }
}
