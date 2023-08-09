package com.example.mad_practical_4_21012021113

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<View>(R.id.button)
        button.setOnClickListener {
            intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

        }
    }

}