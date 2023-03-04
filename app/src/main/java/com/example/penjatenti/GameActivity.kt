package com.example.penjatenti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.penjatenti.databinding.GameactivityMainBinding

class GameActivity : AppCompatActivity() {

    lateinit var binding: GameactivityMainBinding
    lateinit var  hangmanModelView: HangmanModelView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = GameactivityMainBinding.inflate(layoutInflater)

        setContentView(R.layout.gameactivity_main)
        hangmanModelView = HangmanModelView()
        hangmanModelView.getNewWord(binding.hangmanTextOutput)

        binding.guessButton.setOnClickListener{
            val char = binding.guessLetterInput.text.getOrNull(0)
            if(char != null){
                hangmanModelView.guessLetter(char, binding.hangmanTextOutput,binding.alphabet, this)
            }else{
                Toast.makeText(this, "You must submit a letter", Toast.LENGTH_LONG).show()
            }
            binding.guessLetterInput.setText("")
        }
    }
}