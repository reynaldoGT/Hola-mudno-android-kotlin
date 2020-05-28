package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.btnSaludar)

        button.setOnClickListener({
            saludar()
        })
    }

    private fun saludar(){
        val primer_nombre = findViewById<EditText>(R.id.txtPrimerNombre).text
        val segundo_nombre = findViewById<EditText>(R.id.txtSegundoNombre).text
        val primer_apellido = findViewById<EditText>(R.id.txtPrimerApellido).text
        val segundo_apellido = findViewById<EditText>(R.id.txtSegundoApellido).text

        val saludo = findViewById<TextView>(R.id.saludo)

        saludo.text = "Hola ${primer_nombre} ${segundo_nombre} ${primer_apellido} ${segundo_apellido}"

    }
}
