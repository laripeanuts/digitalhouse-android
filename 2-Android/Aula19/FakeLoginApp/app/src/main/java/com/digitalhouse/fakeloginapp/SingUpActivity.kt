package com.digitalhouse.fakeloginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_sing_up.*
import java.lang.Exception

class SingUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_up)

        btnLoginSingup.setOnClickListener {
            finish()
        }

        checkboxSingUp.setOnCheckedChangeListener { _, isChecked ->
            btnSingUp.isEnabled = isChecked
        }

        btnSingUp.setOnClickListener{
            val name = edtSingUpNome.text.toString()
            val email = edtSingUpEmail.text.toString()
            val password = edtSingUpPassword.text.toString()

            if (name.isEmpty()) {
                edtSingUpNome.error = "Nome Vazio"
            } else if (email.isEmpty()) {
                edtSingUpEmail.error = "E-mail Vazio"
            } else if (password.isEmpty()) {
                edtSingUpPassword.error = "Senha Vazio"
            } else {

                try {
                    UserService.register(name, email, password)
                    Toast.makeText(this, "Usuário Cadastrado!", Toast.LENGTH_SHORT).show()
                    finish()
                } catch (e: Exception) {
                    Toast.makeText(this, e.message, Toast.LENGTH_SHORT).show()
                }

            }


        }
    }
}