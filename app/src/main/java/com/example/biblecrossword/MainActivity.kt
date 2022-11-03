package com.example.biblecrossword

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val confirmButton = findViewById<ImageButton>(R.id.confirmBtn)
        confirmButton.setOnClickListener {
            val x11 = findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.m11)
            Toast.makeText(this, x11.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}