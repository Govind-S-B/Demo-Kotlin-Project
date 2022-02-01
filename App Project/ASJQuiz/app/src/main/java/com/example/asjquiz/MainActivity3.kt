package com.example.asjquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    private lateinit var finalScore : TextView
    private lateinit var homeButton: ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        init()
    }

    fun init(){
        finalScore = findViewById(R.id.textView7)
        homeButton = findViewById(R.id.button3)

        finalScore.text = intent.getStringExtra("score").toString() + " / 50"
        homeButton.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}