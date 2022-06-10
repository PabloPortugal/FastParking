package com.example.fastparking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import java.util.*
import kotlin.concurrent.schedule

class splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)

        Timer().schedule(2000){splash()}


    }
    private fun splash() {
        val intent = Intent(this, home::class.java)

        startActivity(intent)

        finish()
    }

    }
