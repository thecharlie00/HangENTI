package com.example.penjatenti

data class HangmanModel(
    val token: String,
    val language: String,
    val maxTries: Int,
    val word: String,
    val incorrectGuesses: Int,
    val correct: Boolean? = null) {

}