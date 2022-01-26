package com.example.asjquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    // declaring global variables

    private lateinit var scoreboard : TextView
    private lateinit var qnnum : TextView
    private lateinit var qn : TextView
    private lateinit var optionA : RadioButton
    private lateinit var optionB : RadioButton
    private lateinit var optionC : RadioButton
    private lateinit var optionD : RadioButton
    private lateinit var submit : Button

    private lateinit var questionBank : ArrayList<Question>
    private var questionNo : Int = 0
    private var answer : String = ""
    private var score : Int = 0




    override fun onCreate(savedInstanceState: Bundle?) { // Oncreate runs when activity launches
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // all variables initialised when activity starts

        scoreboard = findViewById(R.id.textView3)
        qnnum = findViewById(R.id.textView4)
        qn =  findViewById(R.id.textView5)

        optionA = findViewById(R.id.radioButton)
        optionB = findViewById(R.id.radioButton2)
        optionC = findViewById(R.id.radioButton3)
        optionD = findViewById(R.id.radioButton4)

        submit = findViewById(R.id.button2)

        questionBank = ArrayList()
        questionNo = 0

        questionSetter()
        initListeners()
        display(questionNo)

    }

    fun isCorrect(value : String) : Boolean {
        return answer == value
    }

    fun display(index : Int){
        var questionObj = questionBank.get(index)
        qnnum.text = "Question No: " + (index + 1).toString()
        qn.text = questionObj.qn
        optionA.text = questionObj.QOptionA
        optionB.text = questionObj.QOptionB
        optionC.text = questionObj.QOptionC
        optionD.text = questionObj.QOptionD
    }

    fun clearAll(){
        optionA.isChecked = false
        optionB.isChecked = false
        optionC.isChecked = false
        optionD.isChecked = false
    }

    fun questionSetter(){
        questionBank.add(
            Question(
                "Android is",
                "an OS",
                "a Browser",
                "an App",
                "a Hardware",
                "an OS"
            )
        )
        questionBank.add(
            Question(
                "Android got fully x64 compatible since ",
                "Android 5 : Lollipop",
                "Android 4 : Jellybean",
                "Android 7 : Nougat",
                "Android 8 : Oreo",
                "Android 5 : Lollipop"
            )
        )
        questionBank.add(
            Question(
                "Android is developed for",
                "PCs",
                "Servers",
                "Fridge",
                "Mobile Devices",
                "Mobile Devices"
            )
        )
        questionBank.add(
            Question(
                "Android was bought by google for",
                "$50 billion",
                "$100 million",
                "$3",
                "$50 million",
                "50 million"
            )
        )
        questionBank.add(
            Question(
                "Android Started Development in",
                "2000",
                "2003",
                "69",
                "2006",
                "2003"
            )
        )
    }

    fun initListeners(){ // setting up button click listeners

        optionA.setOnClickListener {
            clearAll()
            optionA.isChecked = true
            answer = optionA.text.toString()
        }

        optionB.setOnClickListener{
            clearAll()
            optionB.isChecked = true
            answer = optionB.text.toString()
        }

        optionC.setOnClickListener {
            clearAll()
            optionC.isChecked = true
            answer = optionC.text.toString()
        }

        optionD.setOnClickListener{
            clearAll()
            optionD.isChecked = true
            answer = optionD.text.toString()
        }

        submit.setOnClickListener {
            clearAll()

            if (isCorrect(questionBank.get(questionNo).answer)){
                score += 10
                scoreboard.text = "Points: $score"

            }

            if (questionNo < (questionBank.size - 1)) {
                questionNo++
                display(questionNo)
            }
            else{
                var intent = Intent(this,MainActivity3::class.java)
                intent.putExtra("score",score.toString()) // put extra is used to pass values between activities
                startActivity(intent)
            }
        }

    }
}

// creating Question Class , data class to be specific
data class Question(
    // defining all the parameters/properties here
    var qn : String ,
    var QOptionA : String ,
    var QOptionB : String ,
    var QOptionC : String ,
    var QOptionD : String ,
    var answer : String
) // not using any methods here since this is a data class , kotlin takes care of the setter and getter methods