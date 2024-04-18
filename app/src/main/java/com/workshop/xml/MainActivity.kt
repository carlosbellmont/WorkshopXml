package com.workshop.xml

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myTextView = findViewById<TextView>(R.id.textView)
        myTextView.setOnClickListener {
            makeText(this, "Has heccho click", LENGTH_LONG).show()
        }
    }
}