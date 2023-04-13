package com.example.ex15

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase


class MainActivity4 : AppCompatActivity() {
        @SuppressLint("MissingInflatedId")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main4)
            val db = FirebaseFirestore.getInstance()
            val database =db.collection("Alumni")
            val name = findViewById<EditText>(R.id.name)
            val rno = findViewById<EditText>(R.id.rollno)
            val course = findViewById<EditText>(R.id.course)
            val year = findViewById<EditText>(R.id.year)
            val job=findViewById<EditText>(R.id.job)
            val insert = findViewById<Button>(R.id.registeralumnidetails)
            insert.setOnClickListener {
                if (!rno.text.toString().isNullOrEmpty() && !name.text.toString().isNullOrEmpty()) {

                    val data = hashMapOf(
                        "name" to name.text.toString(),
                        "rno" to rno.text.toString(),
                        "course" to course.text.toString(),
                        "year" to year.text.toString(),
                        "job" to job.text.toString()

                    )
                    database.add(data)
                        .addOnSuccessListener { documentReference ->
                            Log.d(TAG, "DocumentSnapshot added with ID: ${documentReference.id}")
                        }
                        .addOnFailureListener { e ->
                            Log.w(TAG, "Error adding document", e)
                        }

                    Toast.makeText(applicationContext, "success", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(applicationContext, "ERROR", Toast.LENGTH_SHORT).show()
                }

            }
        }
}