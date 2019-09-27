package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mStartBtnn: TextView = findViewById(R.id.chty)

        mStartBtnn.setOnClickListener {

            val intent1 = Intent(this, MyActivity1::class.java)
            startActivity(intent1)
        }
    }
}
