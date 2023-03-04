package com.example.penjatenti

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST


interface ApiManager {
    @GET("new?lang=cat")
    fun getNewWord(lang: String): Call<HangmanModel>

    @POST("/guess")
    fun guessLetter(@Body token: Map<String, String?>): Call<HangmanModel>
    //fun guessLetter(token: Map<String, String?>): Call<HangmanModel>


}