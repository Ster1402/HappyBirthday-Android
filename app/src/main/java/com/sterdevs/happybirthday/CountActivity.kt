package com.sterdevs.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CountActivity : AppCompatActivity() {
    private var counter : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

        val countButton = findViewById<Button>(R.id.countButton)
        val countText = findViewById<TextView>(R.id.countText)
        countButton.setOnClickListener {
            countText.text = "${++counter}"
        }
    }
}