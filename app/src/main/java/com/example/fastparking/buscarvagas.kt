package com.example.fastparking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.fastparking.api.Endpoint
import com.example.fastparking.databinding.BuscarvagaBinding
import com.google.gson.Gson
import com.google.gson.JsonObject
import com.squareup.picasso.Picasso
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class buscarvagas : AppCompatActivity() {

    lateinit var binding: BuscarvagaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = BuscarvagaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.porfavo.setOnClickListener { getVeiculo() }

    }

    private fun getVeiculo() {

        val url = "http://localhost/estacionamento/projetoEstacionamento/api/"
        val placa = binding.placa.text.toString()
        val retrofitClient = retrofitInstance(url)
        val endpoint = retrofitClient.create(Endpoint::class.java)

        endpoint.getByPlaca(placa).enqueue(object : Callback<JsonObject> {

            override fun onResponse(call: Call<JsonObject>, response: Response<JsonObject>) {
                val teste = response.body()?.asString
                binding.teste.setText(teste)
            }

            override fun onFailure(call: Call<JsonObject>, t: Throwable) {
                Toast.makeText(applicationContext, "Erro ao acessar", Toast.LENGTH_LONG).show()
                binding.teste.setText("teste2")
            }

        })

    }

    private fun retrofitInstance(url: String): Retrofit {
        return Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build()
    }
}