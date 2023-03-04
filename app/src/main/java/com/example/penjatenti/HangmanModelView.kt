package com.example.penjatenti

import android.widget.TextView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class HangmanModelView {
    var hangman: HangmanModel? = null
    val outside = Retrofit.Builder()
        .baseUrl("http://hangman.enti.cat:5002/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getNewWord(hangmantextoutput: TextView) {
        val request = outside.create(ApiManager::class.java)
        request.getNewWord().enqueue(object : Callback<HangmanModel> {
            override fun onResponse(call: Call<HangmanModel>, response: Response<HangmanModel>) {
                hangman = response.body() ?: return
                hangmantextoutput.setText(hangman?.word?:"")
            }

            override fun onFailure(call: Call<HangmanModel>, t: Throwable) {
                hangmantextoutput.text = "Error"
            }
        })


    }

    fun guessLetter(letter: Char){

    }

    fun isGameWon(): Boolean{
        return  false
    }
}