package com.example.rihardspokulis1lab

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        val button1 = findViewById<Button>(R.id.button1)
        val textView1 = findViewById<TextView>(R.id.textView1)

        // Set OnClickListener for button1
        button1.setOnClickListener {
            // Change the text of textView1 when button1 is clicked
            textView1.text = "Laboratory work 1" // Replace "New Text Here" with your desired text
        }
    }
}






