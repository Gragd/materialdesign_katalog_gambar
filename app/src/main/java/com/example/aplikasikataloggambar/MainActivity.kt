package com.example.aplikasikataloggambar

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var cardContent1: LinearLayout
    private lateinit var cardContent2: LinearLayout
    private lateinit var cardContent3: LinearLayout

    private lateinit var description1: TextView
    private lateinit var description2: TextView
    private lateinit var description3: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cardContent1 = findViewById(R.id.cardContent1)
        cardContent2 = findViewById(R.id.cardContent2)
        cardContent3 = findViewById(R.id.cardContent3)

        description1 = findViewById(R.id.description1)
        description2 = findViewById(R.id.description2)
        description3 = findViewById(R.id.description3)

        cardContent1.setOnClickListener {
            toggleDescription(description1)
        }

        cardContent2.setOnClickListener {
            toggleDescription(description2)
        }

        cardContent3.setOnClickListener {
            toggleDescription(description3)
        }
    }

    private fun toggleDescription(description: TextView) {
        if (description.visibility == View.GONE) {
            description.visibility = View.VISIBLE
        } else {
            description.visibility = View.GONE
        }
    }
}