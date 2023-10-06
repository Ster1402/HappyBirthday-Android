package com.sterdevs.happybirthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var toastButton: Button
    private lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toastButton = findViewById(R.id.toastButton)
        toastButton.setOnClickListener {
            Toast
                .makeText(this, "Happy Birthday", Toast.LENGTH_SHORT)
                .show()
        }

        nextButton = findViewById(R.id.nextButton)
        nextButton.setOnClickListener {
            val intent = Intent(applicationContext, CountActivity::class.java)
            startActivity(intent)
        }
    }
}