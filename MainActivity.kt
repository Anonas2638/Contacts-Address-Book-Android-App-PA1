package com.example.anoshacontactsaddressbook

// Name: Anosha Naseri
// Date: November 11, 2026
// Assignment: 1.5 PA - Contacts Mobile App

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonAmina = findViewById<Button>(R.id.buttonAmina)
        val buttonAdam = findViewById<Button>(R.id.buttonAdam)

        buttonAmina.setOnClickListener {
            startActivity(Intent(this, AminaActivity::class.java))
        }

        buttonAdam.setOnClickListener {
            startActivity(Intent(this, AdamActivity::class.java))
        }
    }
}
