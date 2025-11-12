package com.example.resturantmeny

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button

    private lateinit var courseCard1: View
    private lateinit var courseCard2: View
    private lateinit var courseCard3: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        button1 = findViewById(R.id.button_menu1)
        button2 = findViewById(R.id.button_menu2)
        button3 = findViewById(R.id.button_menu3)

        courseCard1 = findViewById(R.id.course_card_1)
        courseCard2 = findViewById(R.id.course_card_2)
        courseCard3 = findViewById(R.id.course_card_3)

        val courseHead1 = courseCard1.findViewById<TextView>(R.id.corse_card_title_text)
        val courseHead2 = courseCard2.findViewById<TextView>(R.id.corse_card_title_text)
        val courseHead3 = courseCard3.findViewById<TextView>(R.id.corse_card_title_text)

        val courseInfo1 = courseCard1.findViewById<TextView>(R.id.course_card_info_text)
        val courseInfo2 = courseCard2.findViewById<TextView>(R.id.course_card_info_text)
        val courseInfo3 = courseCard3.findViewById<TextView>(R.id.course_card_info_text)

        val coursePrice1 = courseCard1.findViewById<TextView>(R.id.cours_card_price_text)
        val coursePrice2 = courseCard2.findViewById<TextView>(R.id.cours_card_price_text)
        val coursePrice3 = courseCard3.findViewById<TextView>(R.id.cours_card_price_text)



        // Starters
        button1.setOnClickListener {
            courseHead1.text = getString(R.string.head_text_starter1)
            courseInfo1.text = getString(R.string.info_text_starter1)
            coursePrice1.text = getString(R.string.price_text_starter1)

            courseHead2.text = getString(R.string.head_text_starter2)
            courseInfo2.text = getString(R.string.info_text_starter2)
            coursePrice2.text = getString(R.string.price_text_starter2)

            courseHead3.text = getString(R.string.head_text_starter3)
            courseInfo3.text = getString(R.string.info_text_starter3)
            coursePrice3.text = getString(R.string.price_text_starter3)

        }
        // Mains
        button2.setOnClickListener {
            courseHead1.text = getString(R.string.head_text_main1)
            courseInfo1.text = getString(R.string.info_text_main1)
            coursePrice1.text = getString(R.string.price_text_main1)

            courseHead2.text = getString(R.string.head_text_main2)
            courseInfo2.text = getString(R.string.info_text_main2)
            coursePrice2.text = getString(R.string.price_text_main2)

            courseHead3.text = getString(R.string.head_text_main3)
            courseInfo3.text = getString(R.string.info_text_main3)
            coursePrice3.text = getString(R.string.price_text_main3)

        }
        // Desserts
        button3.setOnClickListener {
            courseHead1.text = getString(R.string.head_text_desert1)
            courseInfo1.text = getString(R.string.info_text_desert1)
            coursePrice1.text = getString(R.string.price_text_desert1)

            courseHead2.text = getString(R.string.head_text_desert2)
            courseInfo2.text = getString(R.string.info_text_desert2)
            coursePrice2.text = getString(R.string.price_text_desert2)

            courseHead3.text = getString(R.string.head_text_desert3)
            courseInfo3.text = getString(R.string.info_text_desert3)
            coursePrice3.text = getString(R.string.price_text_desert3)

        }



    }
}