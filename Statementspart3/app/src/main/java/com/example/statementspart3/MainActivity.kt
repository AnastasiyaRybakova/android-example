package com.example.statementspart3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number : Int = 19
        
        var result : String = ""
        if(number % 2 == 0){
            result = "event"
        }else{
            result = "odd"
        }

        Log.d("KotlinBeginnerPart3", result)

        val myFirstNumber : Float = 45.6f
        val mySecondNumber : Float = 59.6f

        val max = if (myFirstNumber > mySecondNumber){
            myFirstNumber
        }else{
            mySecondNumber
        }
        Log.d("KotkinForBeginnerPart3", "max number is : $max")

        val age : Int = 26

        val rangeAge = if (age <= 15){
            "child"
        }else if (age > 15 && age < 20){
            "Teen"
        }else if (age in 21..23){
            "Young adult"
        }
        else if (age in 24..30){
            "Adult"
        }else if (age in 31..50){
            "Middle Age"
        }else{
            "Old"
        }

        Log.d("KotkinForBeginnerPart3", "$rangeAge")


        val dayOfWeek : Int = 7
        val day = when(dayOfWeek){
            1 -> "Monday"
            2 -> "Tuesday"
            3 -> "Wednesday"
            4 -> "Thursday"
            5 -> "Friday"
            6 -> "Saturday"
            7 -> "Sunday"
            else -> "Invalid Day"
        }

        Log.d("KotkinForBeginnerPart3", "$day")

        val toDo = when(dayOfWeek){
            in 1..5 -> " Go to work"
            in 6..7 -> " Have fun it's weekend"
            else -> "Invalid day"
        }

        Log.d("KotkinForBeginnerPart3", "$toDo")

        val myNumber : Int = 157

        val numberOfDigits = when(myNumber){
            in 1..9 -> "One Digit Number"
            in 10..99 -> "Two Digit Number"
            in 100..1000 -> "Three Digit Number"
            else -> "Four or More Than Four Digits"
        }
        Log.d("KotkinForBeginnerPart3", "$numberOfDigits")

        val numberTypeGuess : Any = 19.5f

        val numberDataType = when(numberTypeGuess){
            is Int -> "Int"
            is Float -> "Float"
            is String -> "String"
            is Boolean -> "Boolean"
            is Array<*> -> "Array"
            else -> "Invalid Data type or Haven't been studied yet"
        }

        Log.d("KotkinForBeginnerPart3", "$numberDataType")


        var myNumberIncreasing : Int = 1

        while (myNumberIncreasing < 10){
            myNumberIncreasing += 1
            Log.d("KotkinForBeginnerPart3", "while, My number is increasing : $myNumberIncreasing")
        }

        do{
            myNumberIncreasing += 1
            Log.d("KotkinForBeginnerPart3", "Do while, my number is increasing : $myNumberIncreasing")
        }while (myNumberIncreasing < 10)


        for (i in 1..5){
            Log.d("KotkinForBeginnerPart3", "i in Range is : $i")
        }

        for (i in 5 downTo 1){
            Log.d("KotkinForBeginnerPart3", "i in Reversed range : $i")
        }

        for (i in 5..20 step 2){
            Log.d("KotkinForBeginnerPart3", "i in Advance 2 : $i")
        }

        val myArray : Array<String> = arrayOf("android", "0", "Kotlin", "Practice as much as you can", "developer")
        for (element in myArray){
            Log.d("KotkinForBeginnerPart3", "$element")
        }

        for (index in myArray.indices){
            Log.d("KotkinForBeginnerPart3", "myArray [$index] = ${myArray[index]}")
        }

        for ((index, element) in myArray.withIndex()){
            Log.d("KotkinForBeginnerPart3", "myArray[$index] = $element")
        }

        // Safe call operators

        val myString : String? = "Ary"
        // for creating a variable, which has null value, we need to  to make it nullable by adding ?

        Log.d("KotkinForBeginnerPart3", "null safe operator : ${myString?.length}")

        // Let function

        myString?.let {
            Log.d("KotkinForBeginnerPart3", "let operator : ${it.length}")
            // it function will not show us the null
        }

        //Elvis operator

        val length = if (myString != null){
            myString.length
        }else{
            -1
        }
        Log.d("KotkinForBeginnerPart3", "Elvis operator : $length")

        // Sum by elvis operator more short code of the previous one (Let function)

        val length2 = myString?.length ?: -1

        Log.d("KotkinForBeginnerPart3", "Elvis operator : $length2")

        val length3 = myString!!.length     //here you can not apply null for the myString it will give the crush of the application
        Log.d("KotkinForBeginnerPart3", "double bang operator : $length3")

    }
}