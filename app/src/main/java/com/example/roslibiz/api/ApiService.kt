package com.example.roslibiz.api

import com.example.roslibiz.model.Inventories
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("/api/inventory/read.php")
    fun getInventories(): Call<List<Inventories>>
}