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
                "Who gave Violet her name",
                "Gilbert",
                "Susan",
                "Spencer",
                "Iris",
                "Gilbert"
            )
        )
        questionBank.add(
            Question(
                "Why did Violet want to be an automemory doll",
                "To escape her hometown",
                "Because she looked up to them",
                "To learn the meaning of I love you",
                "To waste time",
                "To learn the meaning of I love you"
            )
        )
        questionBank.add(
            Question(
                "Why was the emerald brooch so important to her",
                "It was a gift from the Major",
                "It belonged to one of her relatives",
                "It was the last clue to where her family was",
                "It looked beautiful",
                "It was a gift from the Major"
            )
        )
        questionBank.add(
            Question(
                "How did Violet lose her arms",
                "They were shot off during a siege",
                "She was born without them",
                "She lost them in a machinery incident",
                "It belonged to one of her relatives",
                "They were shot off during a siege"
            )
        )
        questionBank.add(
            Question(
                "Who is the owner of the post office Vio worked at",
                "Cattleya",
                "Claudia",
                "Benedict",
                "Leon",
                "Claudia"
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