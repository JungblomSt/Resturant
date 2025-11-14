package com.example.resturantmeny

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActivitysActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activitys)

        var mainLogo = findViewById<View>(R.id.img_head_logo)

        // Click the image to go back to Main
        mainLogo.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        var courseCard1 = findViewById<View>(R.id.course_card_1)
        var courseCard2 = findViewById<View>(R.id.course_card_2)
        var courseCard3 = findViewById<View>(R.id.course_card_3)
        var courseCard4 = findViewById<View>(R.id.course_card_4)

        val courseHead1 = courseCard1.findViewById<TextView>(R.id.corse_card_title_text)
        val courseHead2 = courseCard2.findViewById<TextView>(R.id.corse_card_title_text)
        val courseHead3 = courseCard3.findViewById<TextView>(R.id.corse_card_title_text)
        val courseHead4 = courseCard4.findViewById<TextView>(R.id.corse_card_title_text)

        val courseInfo1 = courseCard1.findViewById<TextView>(R.id.course_card_info_text)
        val courseInfo2 = courseCard2.findViewById<TextView>(R.id.course_card_info_text)
        val courseInfo3 = courseCard3.findViewById<TextView>(R.id.course_card_info_text)
        val courseInfo4 = courseCard4.findViewById<TextView>(R.id.course_card_info_text)

        val coursePrice1 = courseCard1.findViewById<TextView>(R.id.cours_card_price_text)
        val coursePrice2 = courseCard2.findViewById<TextView>(R.id.cours_card_price_text)
        val coursePrice3 = courseCard3.findViewById<TextView>(R.id.cours_card_price_text)
        val coursePrice4 = courseCard4.findViewById<TextView>(R.id.cours_card_price_text)

        courseHead1.text = getString(R.string.head_activity1)
        courseInfo1.text = getString(R.string.info_activity1)
        coursePrice1.text = getString(R.string.none)

        courseHead2.text = getString(R.string.head_activity2)
        courseInfo2.text = getString(R.string.info_activity2)
        coursePrice2.text = getString(R.string.none)

        courseHead3.text = getString(R.string.head_activity3)
        courseInfo3.text = getString(R.string.info_activity3)
        coursePrice3.text = getString(R.string.none)

        courseHead4.text = getString(R.string.head_activity4)
        courseInfo4.text = getString(R.string.info_activity4)
        coursePrice4.text = getString(R.string.none)
    }
}