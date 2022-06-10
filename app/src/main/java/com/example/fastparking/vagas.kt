package com.example.fastparking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class vagas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vagas)
        val voltar = findViewById<ImageButton>(R.id.voltar)
        val quantidadeVagas = findViewById<TextView>(R.id.caixatexto)

        quantidadeVagas.setText("19")

        voltar.setOnClickListener{voltar()}

    }

    private fun voltar() {
        val intent = Intent(this, home::class.java)
        startActivity(intent)
    }

}