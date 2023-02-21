package com.example.babysitter

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dateNeed = findViewById<EditText>(R.id.needdate).text.toString()
        val fromT = findViewById<EditText>(R.id.fromtime).text.toString()
        val toT = findViewById<EditText>(R.id.totime).text.toString()
//        val kid = findViewById<EditText>(R.id.kids).text.toString()
        val phone = findViewById<EditText>(R.id.phno).text.toString()
        val addr = findViewById<EditText>(R.id.address).text.toString()

        val sendRequestButton = findViewById<Button>(R.id.button)
        sendRequestButton.setOnClickListener {
            if (dateNeed.isEmpty()) {
                findViewById<EditText>(R.id.needdate).error = "Enter date"
                return@setOnClickListener
            } else if (fromT.isEmpty()) {
                findViewById<EditText>(R.id.fromtime).error = "Enter from time"
                return@setOnClickListener
            } else if (toT.isEmpty()) {
                findViewById<EditText>(R.id.kids).error = "Enter to time"
                return@setOnClickListener
            }

//            else if (kid.isEmpty()) {
//                findViewById<EditText>(R.id.fromtime).error = "Enter from timr"
//                return@setOnClickListener }

            else if (phone.isEmpty()) {
                findViewById<EditText>(R.id.phno).error = "Enter phone number"
                return@setOnClickListener
            } else if (addr.isEmpty()) {
                findViewById<EditText>(R.id.address).error = "Enter address"
                return@setOnClickListener
            }
        }

            // Save the details to DB
            val dbHelper = MyDBHelper(this)
            val db = dbHelper.writableDatabase
            val values = ContentValues().apply {
//                put(MyDBHelper.COLUMN_NAME, name)
//                put(MyDBHelper.COLUMN_EMAIL, email)
//                put(MyDBHelper.COLUMN_AGE, age)
//                put(MyDBHelper.COLUMN_GENDER, gender)
//            }
            val newRowId = db.insert(MyDBHelper.TABLE_NAME, null, values)

            // Display toast message
            Toast.makeText(this, "Your details saved", Toast.LENGTH_SHORT).show()

}