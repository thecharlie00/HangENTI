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
        hangmanModelView.getNewWord(binding.hangmantextoutput)

        binding.guessbutton.setOnClickListener{
            val char = binding.hangmantextinput.text.getOrNull(0)
            if(char != null){
                hangmanModelView.guessLetter(char)
            }else{
                Toast.makeText(this, "You must submit a letter", Toast.LENGTH_LONG).show()
            }

        }
    }
}