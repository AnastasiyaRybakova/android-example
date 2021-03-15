package com.example.variablespart2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myNumber1 : Int = 1
        val myNumber2 : Int = 5

        Log.d("KotlinBeginnerPart2", "myNumber1 < myNumber2 : ${myNumber1 < myNumber2}")
        Log.d("KotlinBeginnerPart2", "myNumber1 > myNumber2 :${myNumber1 > myNumber2}")

        val myNumber3 : Int = 10
        val myNumber4 : Int = 10

        Log.d("KotlinBeginnerPart2", "myNumber3 <= myNumber4 : ${myNumber3 <= myNumber4}")
        Log.d("KotlinBeginnerPart2", "myNumber3 >= myNumber4 : ${myNumber3 >= myNumber4}")
        Log.d("KotlinBeginnerPart2", "myNumber1 == myNumber4 : ${myNumber1 != myNumber4}")

        Log.d("KotlinBeginnerPart2", "and operator case one : ${(myNumber1 < myNumber2) && (myNumber3 <= myNumber4)}")
        Log.d("KotlinBeginnerPart2", "and operator case two : ${(myNumber1 < myNumber2) && (myNumber3 != myNumber4)}")
        Log.d("KotlinBeginnerPart2", "and operator case three : ${(myNumber1 > myNumber2) && (myNumber3 != myNumber4)}")

        Log.d("KotlinBeginnerPart2", "or operator case one : ${(myNumber1 < myNumber2) || (myNumber3 <= myNumber4)}")
        Log.d("KotlinBeginnerPart2", "and operator case two : ${(myNumber1 < myNumber2) || (myNumber3 > myNumber4)}")

        Log.d("KotlinBeginnerPart2",
                "and operator case three : ${(myNumber1 > myNumber2) || (myNumber1 <= myNumber4) || (myNumber3 <= myNumber2)}")


    }
}