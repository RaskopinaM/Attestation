package com.example.succesnote

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button

class ResultActivity() : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val mPodtBtn = findViewById<Button>(R.id.PodtBtn)
        mPodtBtn.setOnClickListener {
            startActivity(Intent(this@ResultActivity, PodtActivity::class.java))
        }

        val mOtgimBtn = findViewById<Button>(R.id.OtgimBtn)
        mOtgimBtn.setOnClickListener {
            startActivity(Intent(this@ResultActivity, OtgimActivity::class.java))
        }
        val mprisedBtn = findViewById<Button>(R.id.prisedBtn)
        mprisedBtn.setOnClickListener {
            startActivity(Intent(this@ResultActivity, PrisedActivity::class.java))
        }

        val mPressBt = findViewById<Button>(R.id.PressBt)
        mPressBt.setOnClickListener {
            startActivity(Intent(this@ResultActivity, PressActivity::class.java))
        }
    }
}

