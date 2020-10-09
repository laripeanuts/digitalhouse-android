package com.example.aula16calculohora

import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular.setOnClickListener{
            val horasTrabalhadas = edtHorasTrabalhadas.text.toString().toInt()
            val valorHora = edtValorHora.text.toString().toDouble()
            val resultado = horasTrabalhadas * valorHora

            txtResultado.text = "R$ $resultado"

            val imm: InputMethodManager =
                getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
            if (imm.isActive()) imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0)
        }
    }
}