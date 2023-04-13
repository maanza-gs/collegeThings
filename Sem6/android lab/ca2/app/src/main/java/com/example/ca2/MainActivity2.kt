package com.example.ca2

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.google.firebase.auth.FirebaseAuth


class MainActivity2 : AppCompatActivity() {
    private var auth: FirebaseAuth = Firebase.auth

    //    public override fun onStart() {
//        super.onStart()
//        // Check if user is signed in (non-null) and update UI accordingly.
//        val currentUser = auth.currentUser
//        if(currentUser != null){
////            Toast.makeText(baseContext, "Hello "+currentUser.email.toString(),
////                Toast.LENGTH_SHORT).show()
//            val intent = Intent(applicationContext, MainActivity3::class.java)
//            finish()
//            startActivity(intent)
//        }
//    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        setContentView(R.layout.activity_main2)
        val email = findViewById<EditText>(R.id.email_input)
        val password = findViewById<EditText>(R.id.password_input)

        findViewById<Button>(R.id.register_button).setOnClickListener {
            val email_input = email.text.toString()
            val pwd = password.text.toString()
            if(email_input!="" && pwd.length>=8){
                auth.createUserWithEmailAndPassword(email_input, pwd)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            // Sign in success
                            Log.d(ContentValues.TAG, "createUserWithEmail:success")
                            val user = auth.currentUser
                            Toast.makeText(baseContext, "Successfully registered.",
                                Toast.LENGTH_SHORT).show()
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(ContentValues.TAG, "createUserWithEmail:failure", task.exception)
                            Toast.makeText(baseContext, "Registration unsuccessful.",
                                Toast.LENGTH_SHORT).show()
//                            updateUI(null)
                        }
                    }
            }

        }

        findViewById<Button>(R.id.sign_in_button).setOnClickListener {
            val email_input = email.text.toString()
            val pwd = password.text.toString()
            if(email_input!="" && pwd.length>=8) {
                auth.signInWithEmailAndPassword(email_input, pwd)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(ContentValues.TAG, "signInWithEmail:success")
                            val user = auth.currentUser
                            if (user != null) {
                                val intent = Intent(applicationContext, MainActivity3::class.java)
                                finish()
                                startActivity(intent)
                            }

                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(ContentValues.TAG, "signInWithEmail:failure", task.exception)
                            Toast.makeText(
                                baseContext, "Authentication failed.",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
            }
        }

    }
}