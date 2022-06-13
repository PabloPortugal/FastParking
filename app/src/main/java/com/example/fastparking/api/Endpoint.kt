package com.example.fastparking.api

import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface Endpoint {
    @GET("registros/buscar/{placa}")
    fun getByPlaca(@Path(value = "placa") placa : String) : Call<JsonObject>
}
