package com.example.succesnote

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        val mYougaBtn = findViewById<Button>(R.id.YougaBtn)
        mYougaBtn.setOnClickListener {
            val browseIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://yandex.ru/video/preview/12071647749575501864")
            )
            startActivity(browseIntent)
        }

        val mZumbaBtn = findViewById<Button>(R.id.ZumbaBtn)
        mZumbaBtn.setOnClickListener {
            val browseIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://yandex.ru/video/preview/10567165193121205358")
            )
            startActivity(browseIntent)
        }


        val mStretchbtn = findViewById<Button>(R.id.Stretchbtn)
        mStretchbtn.setOnClickListener {
            val browseIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://yandex.ru/video/preview/5105467963117866381")
            )
            startActivity(browseIntent)
        }

        val mPowerBtn = findViewById<Button>(R.id.PowerBtn)
        mPowerBtn.setOnClickListener {
            val browseIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://yandex.ru/video/preview/16431920170556050051")
            )
            startActivity(browseIntent)
        }

        val mExercisesBtn = findViewById<Button>(R.id.ExercisesBtn)
        mExercisesBtn.setOnClickListener {
            val browseIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://yandex.ru/video/preview/15652012174488838985")
            )
            startActivity(browseIntent)
        }
    }
}