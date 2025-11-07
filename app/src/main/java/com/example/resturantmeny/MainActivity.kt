package com.example.resturantmeny

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private val menu1 = mutableListOf("Surkorv", "Kött på pinne", "Gravlaxrulle")
    private val menu2 = mutableListOf("1/2 Kyckling","Riddarrester","Betbiffar")
    private val menu3 = mutableListOf("Äppelkaka","Päron","Saffranspannkaka")

    private val itemlist = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


    }
}