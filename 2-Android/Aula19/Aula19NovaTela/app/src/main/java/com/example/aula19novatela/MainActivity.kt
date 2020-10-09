package com.example.aula19novatela

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkBox.setOnCheckedChangeListener { _, isChecked ->
            btnNovaTela.isEnabled = checkBox.isChecked
        }

        btnNovaTela.setOnClickListener{
            val vaiNovaTela = Intent(this, NovaTela::class.java)
            vaiNovaTela.putExtra("NOME", "Larissa")
            startActivity(vaiNovaTela)
        }

        btnToastTeste.setOnClickListener{
            Toast.makeText(this, "Teste", Toast.LENGTH_SHORT).show()
        }

    }
}