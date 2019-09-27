package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MyActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my1)

        val mStartBtn : Button = findViewById(R.id.startbtn)

        mStartBtn.setOnClickListener {

            val intent = Intent( this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
