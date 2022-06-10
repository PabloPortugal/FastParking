package com.example.fastparking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class buscarvagas2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.buscarvagas2)
        val buscarVagas = findViewById<ImageButton>(R.id.voltar1)
        val placas = findViewById<TextView>(R.id.placas)
        val vagass = findViewById<TextView>(R.id.vagass)
        val tempohoras = findViewById<TextView>(R.id.tempohoras)
        val valoratual = findViewById<TextView>(R.id.valoratual)
        val placa = "BRA-2848"
        val vaga = " A320"
        val horas= " 5 HORAS"
        val valor =" R\$ 35,00"

        placas.setText("PLACA: " + placa)
        vagass.setText("VAGA:" + vaga)
        tempohoras.setText("TEMPO:" + horas)
        valoratual.setText("VALOR ATUAL:" + valor)

        buscarVagas.setOnClickListener{buscarVagas()}
    }
    private  fun buscarVagas() {
      val intent = Intent(this, home::class.java)
      startActivity(intent)
    }




}