package com.dsin.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var diceimg : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton : Button = findViewById(R.id.button)
            rollbutton.setOnClickListener {
             rollDice()
                Toast.makeText(this,"Rolled",Toast.LENGTH_SHORT).show()
            }
        diceimg = findViewById(R.id.img_d)
        }

    private fun rollDice() {
        val random = Random().nextInt(6) + 1
        val disp1 = when(random) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }

        diceimg.setImageResource(disp1)
    }
}
