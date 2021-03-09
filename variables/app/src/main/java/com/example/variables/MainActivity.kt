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

        var result : Int = a + b

        Log.d("KotlinBeginners", "Result a + b : $result")

        result = a - b

        Log.d("KotlinBeginner", "Result a - b : $result")

        result = a / b

        Log.d("KotlinBeginner", "Result a/b : $result")
    }
}