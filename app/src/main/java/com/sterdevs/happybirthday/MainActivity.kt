package com.sterdevs.happybirthday

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sterdevs.happybirthday.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // First thing we need to do when using ViewBinding...
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        // Next...
        setContentView(viewBinding.root)

        // Then...
        viewBinding.toastButton.setOnClickListener {
            Toast.makeText(this, "I wish the best my friend 🥳🔥🎁", Toast.LENGTH_SHORT).show()
        }
    }
}