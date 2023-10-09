package com.example.rihardspokulis1lab

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val textView1 = findViewById<TextView>(R.id.textView1)

        // Set OnClickListener for button1
        button1.setOnClickListener {
            // Change the text of textView1 when button1 is clicked
            textView1.text = "Laboratory work 1"
        }

        // Set OnClickListener for button2
        button2.setOnClickListener {
            // Change the text color of textView1 to red when button2 is clicked
            textView1.setTextColor(resources.getColor(android.R.color.holo_red_dark))
        }
    }
}







