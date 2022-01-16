package com.example.asjquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        init()
    }

    fun init(){
        var finalScore : TextView = findViewById(R.id.textView7)
        var homeButton : Button = findViewById(R.id.button3)
    }
}