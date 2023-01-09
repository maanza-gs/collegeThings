package com.example.fillforms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.provider.ContactsContract.CommonDataKinds.Phone
import android.provider.ContactsContract.RawContacts.Data
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.Date

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val first = findViewById<EditText>(R.id.fname)
        val last = findViewById<EditText>(R.id.lname)
        val phone = findViewById<EditText>(R.id.phno)
        val email = findViewById<EditText>(R.id.email)
        val bdate = findViewById<EditText>(R.id.bday)
        val gen = findViewById<EditText>(R.id.gender)
        val address = findViewById<EditText>(R.id.address)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val finame=first.text.toString()
            if (first.text.toString() == "" || last.text.toString() == "" || phone.text.toString() == "" || email.text.toString() == "" || bdate.text.toString() == "" || address.text.toString() == "") {
                Toast.makeText(
                    this@MainActivity,
                    "please enter all the details",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                button.visibility = VISIBLE
                val abc = Intent(applicationContext, MainActivity2::class.java)
                abc.putExtra("fname", finame)
                startActivity(abc)
            }
        }
    }
}