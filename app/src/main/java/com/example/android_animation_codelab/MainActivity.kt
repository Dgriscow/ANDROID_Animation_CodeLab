package com.example.android_animation_codelab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Reference to the button to go to the next view
        var nextButton = findViewById<Button>(R.id.button4)


        //Make the intent for the Swipe View
        nextButton.setOnClickListener {
            val nextScreen = Intent(this@MainActivity, PropertiesAnimationActivity::class.java)
            startActivity(nextScreen)
        }

    }
}