package com.example.aula16temperatura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnConverter.setOnClickListener{
            val temperaturaEmCelsius = edtMeuNome.text.toString().toInt()
            val formulaConversao = (temperaturaEmCelsius * 9 / 5) + 32

            txtResultado.text = "$formulaConversao ºF"
        }
    }
}