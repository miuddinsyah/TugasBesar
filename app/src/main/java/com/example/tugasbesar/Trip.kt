package com.example.tugasbesar

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.tugasbesar.R

class Trip : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.trip)

        val original1: ImageButton = findViewById(R.id.original1)
        val original2: ImageButton = findViewById(R.id.original2)
        val original3: ImageButton = findViewById(R.id.origina3)
        val idrTextView: TextView = findViewById(R.id.idr)
        val back: ImageButton = findViewById(R.id.backbutton)

        back.setOnClickListener {
            // Create an Intent to navigate to LoginActivity
            val intent = Intent(this, SeleksiActivity::class.java)

            // Start the LoginActivity
            startActivity(intent)
        }

        original1.setOnClickListener {
            idrTextView.text = "IDR 939.510"
        }

        original2.setOnClickListener {
            idrTextView.text = "IDR 1.235.371"
        }

        original3.setOnClickListener {
            idrTextView.text = "IDR 999.999"
        }
    }
}
