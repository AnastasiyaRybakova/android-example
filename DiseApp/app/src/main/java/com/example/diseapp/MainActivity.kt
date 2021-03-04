package com.example.diseapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var diceOneImg: ImageView
    lateinit var diceTwoImg: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceOneImg = findViewById(R.id.dice_one)
        diceTwoImg = findViewById(R.id.dice_two)
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
        val randomNumber4one = (1..6).random()
        val randomNumber4two = (1..6).random()
    /*
    Image dice:
    randomly pick the dice
     */
        /*for the first dice */
        val image4one = when (randomNumber4one) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6

            else -> R.drawable.dice_empty
        }
        /* for the second dice */
        val image4two = when (randomNumber4two) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6

            else -> R.drawable.dice_empty
        }

        diceOneImg.setImageResource(image4one)
        diceTwoImg.setImageResource(image4two)

    }

}