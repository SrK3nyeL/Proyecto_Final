package com.example.preguntados.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.preguntados.R

    class JuegoActivity : AppCompatActivity() {

        // Declarar los botones para las opciones
        private lateinit var opcion1: Button
        private lateinit var opcion2: Button
        private lateinit var opcion3: Button
        private lateinit var opcion4: Button

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_juego)

            // Inicializar las vistas
            opcion1 = findViewById(R.id.opcion1)
            opcion2 = findViewById(R.id.opcion2)
            opcion3 = findViewById(R.id.opcion3)
            opcion4 = findViewById(R.id.opcion4)

            // Configurar OnClickListener para cada botón de opción
            opcion1.setOnClickListener { checkAnswer(it) }
            opcion2.setOnClickListener { checkAnswer(it) }
            opcion3.setOnClickListener { checkAnswer(it) }
            opcion4.setOnClickListener { checkAnswer(it) }
        }

        // Método para verificar la respuesta
        private fun checkAnswer(view: View) {
            // Definir la respuesta correcta (puedes cambiar esta lógica si es necesario)
            val correctAnswer = R.id.opcion1

            if (view.id == correctAnswer) {
                // Respuesta correcta, navegar a Activity_resultados
                val intent = Intent(this, ResultadoActivity::class.java)
                intent.putExtra("resultado", "correcto") // Pasar información a la siguiente actividad si lo necesitas
                startActivity(intent)
            } else {
                // Respuesta incorrecta, puedes manejarlo aquí si deseas mostrar un mensaje
                val intent = Intent(this, ResultadoActivity::class.java)
                intent.putExtra("resultado", "incorrecto")
                startActivity(intent)
            }
        }
    }
