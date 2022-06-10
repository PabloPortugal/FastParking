package com.example.fastparking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import java.util.*
import kotlin.concurrent.schedule

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)
        val home = findViewById<ImageButton>(R.id.vagas)
        val buscarvagas = findViewById<ImageButton>(R.id.buscarvagas)
        home.setOnClickListener{ home()}
        buscarvagas.setOnClickListener{buscarVagas()}
    }
        private fun home(){
            val intent = Intent(this, vagas::class.java)
            startActivity(intent)

        }

        private fun buscarVagas(){
            val intent = Intent(this, buscarvagas2::class.java)
            startActivity(intent)

        }


}
