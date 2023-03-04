package com.example.penjatenti

import com.google.gson.annotations.SerializedName

data class HangmanModel(
    val token: String = "",
    val language: String = "",
    val maxTries: Int,
    val incorrectGuesses: Int,
    val correct: Boolean? = null,

    val word: String = ""


) {

}