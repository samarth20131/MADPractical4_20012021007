package com.example.madpractical4_20012021007

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Explicit_Intent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent)
        val message = intent.getStringExtra("message_key")
        val messageTextView: TextView = findViewById(R.id.text)
        messageTextView.text = "Your message is: " + message
    }
}