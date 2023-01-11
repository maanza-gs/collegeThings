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
        val gender = findViewById<EditText>(R.id.gender)
        val address = findViewById<EditText>(R.id.address)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            if (first.text.toString() == "" || last.text.toString() == "" || phone.text.toString() == "" || email.text.toString() == "" || bdate.text.toString() == "" || address.text.toString() == "") {
                Toast.makeText(applicationContext,"Enter the required fields", Toast.LENGTH_SHORT).show()
            } else {
                button.visibility = VISIBLE
                val intents = Intent(this, MainActivity2::class.java)
                intents.putExtra("fname", first.text.toString())
                intents.putExtra("lname", last.text.toString())
                intents.putExtra("phone", phone.text.toString())
                intents.putExtra("email", email.text.toString())
                intents.putExtra("bdate", bdate.text.toString())
                intents.putExtra("gen", gender.text.toString())
                intents.putExtra("address", address.text.toString())
                startActivity(intents)
            }
        }
    }
}
