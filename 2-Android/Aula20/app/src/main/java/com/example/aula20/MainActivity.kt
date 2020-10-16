package com.example.aula20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        floating_action_button.setOnClickListener {
            Snackbar.make(minhaTela, "Tentar novamente", Snackbar.LENGTH_LONG).show()
            MaterialAlertDialogBuilder(this)
                .setTitle("Titulo")
                .setMessage("Mensagem")
                .setNegativeButton("Não") { dialog, which ->
                    // Respond to negative button press
                }
                .setPositiveButton("Sim") { dialog, which ->
                    // Respond to positive button press
                }
                .show()
        }
    }
}