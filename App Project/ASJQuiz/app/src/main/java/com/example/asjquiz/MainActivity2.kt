package com.example.asjquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        init()
    }

    fun init(){
        var scoreboard : TextView = findViewById(R.id.textView3)
        var qnnum : TextView = findViewById(R.id.textView4)
        var qn : TextView =  findViewById(R.id.textView5)
        var optionA : RadioButton = findViewById(R.id.radioButton)
        var optionB : RadioButton = findViewById(R.id.radioButton2)
        var optionC : RadioButton = findViewById(R.id.radioButton3)
        var optionD : RadioButton = findViewById(R.id.radioButton4)
        var submit : Button = findViewById(R.id.button2)
    }
}