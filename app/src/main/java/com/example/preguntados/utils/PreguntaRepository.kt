package com.example.preguntados.utils

import com.example.preguntados.models.Pregunta

object PreguntaRepository {
    private val listaPreguntas = listOf(
        Pregunta(
            categoria = "Historia",
            pregunta = "¿Quién fue el primer presidente de los Estados Unidos?",
            opciones = listOf("George Washington", "Thomas Jefferson", "Abraham Lincoln", "John Adams"),
            respuestaCorrecta = "George Washington"
        ),
        Pregunta(
            categoria = "Ciencia",
            pregunta = "¿Cuál es el elemento químico con el símbolo O?",
            opciones = listOf("Oxígeno", "Oro", "Osmio", "Oxalato"),
            respuestaCorrecta = "Oxígeno"
        ),
        Pregunta(
            categoria = "Geografía",
            pregunta = "¿Cuál es la capital de Francia?",
            opciones = listOf("Roma", "Madrid", "París", "Berlín"),
            respuestaCorrecta = "París"
        )
    )

    fun obtenerPreguntas(): List<Pregunta> {
        return listaPreguntas.shuffled() // Devuelve las preguntas en orden aleatorio
    }
}