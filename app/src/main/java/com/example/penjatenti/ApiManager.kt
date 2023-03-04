package com.example.penjatenti

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST


interface ApiManager {
    @GET("new?lang=cat")
    fun getNewWord(): Call<HangmanModel>

    @POST("/guess")
    fun guessLetter(@Body token: String, @Body letter:String): Call<HangmanModel>


}