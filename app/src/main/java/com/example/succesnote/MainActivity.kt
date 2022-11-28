package com.example.succesnote

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mStartActBtn = findViewById<Button>(R.id.startActBtn)
        mStartActBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity, NewActivity::class.java))
        }
        val mCallBtn = findViewById<Button>(R.id.CallBtn)
        mCallBtn.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "123456789"))
            startActivity(dialIntent)
        }

        val mResultBtn = findViewById<Button>(R.id.ResultBtn)
        mResultBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity, ResultActivity::class.java))
        }
    }
}