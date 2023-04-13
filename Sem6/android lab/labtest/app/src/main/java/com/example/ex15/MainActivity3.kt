package com.example.ex15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.database.FirebaseDatabase
import android.app.AlertDialog
import android.content.ContentValues.TAG
import android.util.Log
import com.google.firebase.firestore.FirebaseFirestore

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val button = findViewById<Button>(R.id.view)
        val db=FirebaseFirestore.getInstance()
        val viewbycourse = findViewById<Button>(R.id.viewbycourse)

        button.setOnClickListener {
            db.collection("Alumni")
                .get()
                .addOnSuccessListener { result ->
                    val userList = ArrayList<String>()
                    for (document in result) {
                        val name = document.getString("name")
                        val job = document.getString("job")
                        val rno = document.getString("rno")

                        val userString= "Name: $name\nJob: $job\nRno: $rno"
                        userList.add(userString)
                    }

                    val dialogBuilder = AlertDialog.Builder(this)
                    dialogBuilder.setTitle("User Details")
                    dialogBuilder.setMessage(userList.joinToString("\n\n"))
                    dialogBuilder.setPositiveButton("OK", null)
                    val dialog = dialogBuilder.create()
                    dialog.show()
                }
                .addOnFailureListener { e ->
                    Log.w(TAG, "Error getting user details", e)
                }
        }
    }
}