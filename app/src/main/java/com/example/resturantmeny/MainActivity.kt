package com.example.resturantmeny

import android.os.Bundle
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

    // =========== VARIABLES ==============
    private lateinit var listView: ListView
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button

    private lateinit var listViewAdapter: ArrayAdapter<String>

    private val menu1 = mutableListOf("Surkorv", "Kött på pinne", "Gravlaxrulle")
    private val menu2 = mutableListOf("1/2 Kyckling","Riddarrester","Betbiffar")
    private val menu3 = mutableListOf("Äppelkaka","Päron","Saffranspannkaka")

    private val itemlist = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        button1 = findViewById(R.id.button_menu1)
        button2 = findViewById(R.id.button_menu2)
        button3 = findViewById(R.id.button_menu3)



        listViewAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, itemlist)
        listView.adapter = listViewAdapter

        button1.setOnClickListener {
            listViewAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, menu1)
            listView.adapter = listViewAdapter
        }
        button2.setOnClickListener {
            listViewAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, menu2)
            listView.adapter = listViewAdapter
        }
        button3.setOnClickListener {
            listViewAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, menu3)
            listView.adapter = listViewAdapter
        }



    }
}