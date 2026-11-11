package com.example.anoshacontactsaddressbook

// Name: Anosha Naseri
// Date: November 11, 2026
// Assignment: 1.5 PA - Contacts Mobile App

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AdamActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adam)

        val backButton = findViewById<Button>(R.id.buttonBack)

        backButton.setOnClickListener {
            finish()
        }
    }
}
