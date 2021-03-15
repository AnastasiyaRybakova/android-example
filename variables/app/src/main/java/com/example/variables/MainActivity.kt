package com.example.variables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a : Int = 10
        val b : Int = 5
        val c : Int = 3
        val d : Int = 2

        var result : Int = a + b

        Log.d("KotlinBeginners", "Result a + b : $result")

        result = a - b

        Log.d("KotlinBeginner", "Result a - b : $result")

        result = a / b

        Log.d("KotlinBeginner", "Result a/b : $result")

        result = a * b

        Log.d("KotlinBeginner", "Result a*b : $result")

        result = a%b

        Log.d("KotlinBeginner", "Result a%b : $result")

        result = a%c

        Log.d("KotlinBeginner", "Result a%c : $result")

        result = a*b - c/d

        Log.d("KotlinBeginner", "Result : $result")

        result = a*b + c/d

        Log.d("KotlinBeginner", "Result : $result")

        result = (a+b + d)/c

        Log.d("KotlinBeginner", "Result : $result")

        val myAge : Int = 26
        val yearsLater : Int = 10
        val myAgeIn2030 : Int = myAge + yearsLater

        Log.d("KotlinBeginner", "Result : $myAgeIn2030")

        val myNumber1 : Float = 1.4f
        val myNumber2 : Float = 4.5f

        result = (myNumber1 + myNumber2).toInt()

        Log.d("KotlinBeginner", "Result : $result")

        val resultForFloatingPoint : Float = myNumber1 + myNumber2

        Log.d("KotlinBeginner", "Result : $resultForFloatingPoint")

        val isRaining : Boolean = true
        val isSunny : Boolean = false

        Log.d("KotlinBeginner", "If it's raining : $isRaining and if it's sunny : $isSunny")

        val firstCharacter : Char = 'a'
        val secondCharacter : Char = '5'
        Log.d("KotlinBeginners", "result is : $firstCharacter")
        Log.d("KotlinBeginner", "secondCharacter : $secondCharacter")

        val myFirstString : String = "My name is : "
        val mySecondString : String = "Anastasiya"
        val myThirstString : String = " and my age is 26"

        val resultOfString : String = myFirstString + mySecondString + myThirstString
        val resultOfStrOfTheSecond : String = "$myFirstString$mySecondString$myThirstString"

        Log.d("KotlinBeginner", "resultOfString : $resultOfString")
        Log.d("KotlinBeginner", "resultOfStrOfTheSecond : $resultOfStrOfTheSecond")

        val intArray : Array<Int> = arrayOf(1, 5, 10, 2)
        val stringArray : Array<String> = arrayOf("Ary", "20", "robotperson")
        val mixArray : Array<Any> = arrayOf(5, "Ary", 1.6f, true, 'c')

        Log.d("KotlinBeginners", "intArray : ${intArray[0]}, ${stringArray[1]}, ${mixArray[3]}")

    }
}