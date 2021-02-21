package com.example.diseapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupButton()
    }

    /*
    Setup button
     */
    private fun setupButton() {
        val rollButton = findViewById<Button>(R.id.btn_roll_dice)

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    /*
    Roll dice:
    picking random number to display
     */
    private fun rollDice() {
        val randomNumber = (1..6).random()

        val randomNumberTxt = findViewById<TextView>(R.id.txt_view_random_number)
        randomNumberTxt.text = randomNumber.toString()
    }

}