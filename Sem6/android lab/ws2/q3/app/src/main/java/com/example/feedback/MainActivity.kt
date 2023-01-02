package com.example.feedback

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submitBtn = findViewById<Button>(R.id.button)
        var feedback = findViewById<EditText>(R.id.feedbackinput)
        val message = findViewById<TextView>(R.id.ratingText)
        val rating=findViewById<RatingBar>(R.id.ratingBar)

        rating.setOnRatingBarChangeListener(RatingBar.OnRatingBarChangeListener { rb, rating, fromUser ->
            val ratingvalue = rb.getRating().toInt()
            if (ratingvalue == 5)
                message.setText("Awesome, I really loved it ! ")
            else if (ratingvalue == 4)
                message.setText("Very tasty ! keep it up")
            else if (ratingvalue == 3)
                message.setText("Not bad")
            else if (ratingvalue == 2)
                message.setText("Need improvement")
            else if (ratingvalue == 1)
                message.setText("Not as much as expected")
            else
                message.setText("")
        })

        submitBtn.setOnClickListener(){
            Toast.makeText(applicationContext,"Submitted Successfully!",Toast.LENGTH_SHORT).show()
        }
    }
}