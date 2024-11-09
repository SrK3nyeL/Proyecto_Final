package com.example.preguntados.models

import com.example.preguntados.utils.PreguntaRepository

class Juego {
    private val preguntas = PreguntaRepository.obtenerPreguntas()
    private var puntaje = 0
    private var vidas = 3
    private var indicePregunta = 0

    fun obtenerPreguntaActual(): Pregunta? {
        return if (indicePregunta < preguntas.size) preguntas[indicePregunta] else null
    }

    fun verificarRespuesta(opcion: String): Boolean {
        val preguntaActual = obtenerPreguntaActual() ?: return false
        val esCorrecta = opcion == preguntaActual.respuestaCorrecta

        if (esCorrecta) {
            puntaje += 10 // Sumar puntos si es correcto
        } else {
            vidas-- // Restar una vida si es incorrecto
        }
        indicePregunta++
        return esCorrecta
    }

    fun obtenerPuntaje(): Int = puntaje

    fun obtenerVidas(): Int = vidas

    fun juegoTerminado(): Boolean = vidas <= 0 || indicePregunta >= preguntas.size
}