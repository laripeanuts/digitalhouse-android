package com.digitalhouse.fakeloginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCreateAccount.setOnClickListener{
            val vaiSingUp = Intent(this, SingUpActivity::class.java)
            startActivity(vaiSingUp)
        }

        btnLogIn.setOnClickListener {
            val useremail = edtEmail.text.toString()
            val userpassword = edtPassword.text.toString()
            val userModel = UserService.logIn(useremail, userpassword)

            if(userModel != null) {
                val vaiWelcome = Intent(this, WelcomeActivity::class.java)
                vaiWelcome.putExtra("NOME", userModel.name)
                startActivity(vaiWelcome)
            } else {
                Toast.makeText(this,"Usuário ou senha inválidos!", Toast.LENGTH_LONG).show()
            }
        }
    }
}