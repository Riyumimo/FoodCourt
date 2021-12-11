package com.example.foodcourt

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.detail_toolbar)
        setSupportActionBar(toolbar)
        toolbar.setNavigationOnClickListener {
            val inten = Intent(this, MainActivity::class.java)
            startActivity(inten)
        }

        // Enables Always-on

    }
}