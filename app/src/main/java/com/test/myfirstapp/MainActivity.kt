package com.test.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var peopleCounter = 0
        val textUI = findViewById<TextView>(R.id.textView2)
        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val btnSubtract = findViewById<Button>(R.id.subtractbtn)

        btnSubtract.visibility = INVISIBLE
        btnClickMe.text = "Start"
        btnClickMe.setOnClickListener {
            peopleCounter += 1
            textUI.text = peopleCounter.toString()
            btnClickMe.text = "Add 1"
            btnSubtract.visibility = VISIBLE

        }

        btnSubtract.setOnClickListener {
            peopleCounter -= 1
            if (peopleCounter < 0) {
                peopleCounter = 0
            }
            textUI.text = peopleCounter.toString()
        }

        Toast.makeText(this, "This only lets you count from 0", Toast.LENGTH_LONG).show()
    }
}