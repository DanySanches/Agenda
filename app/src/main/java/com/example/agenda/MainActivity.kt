package com.example.agenda

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val edtNome = findViewById<EditText>(R.id.edtNome)
        val edtTelefone = findViewById<EditText>(R.id.edtTelefone)
        val edtEmail = findViewById<EditText>(R.id.edtEmail)
        val btnGravar = findViewById<Button>(R.id.btnGravar)


        btnGravar.setOnClickListener {
            val nome = edtNome.text.toString()
            val telefone = edtTelefone.text.toString()
            val email = edtEmail.text.toString()


            Log.v("AGENDA", "Nome: $nome")
            Log.v("AGENDA", "Telefone: $telefone")
            Log.v("AGENDA", "Email: $email")
        }
    }
}