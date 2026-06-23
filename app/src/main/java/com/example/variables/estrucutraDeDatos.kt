package com.example.variables

/**
 * Project: Variables
 * From: com.example.variables
 * Created by: pechm
 * On: 16/06/2026
 * All rights reserved: 2026
 */

fun main() {
    println("Arreglos")
    val pekom = Array(3) { "" }
    pekom[0] = "Pikacho"
    pekom[1] = "Charmander"
    pekom[2] = "Squirtle"

    println("Arreglo bidimensional")
    // Usamos IntArray para que acepte números enteros
    val tablero = Array(3) { IntArray(3) }

    tablero[0][0] = 10
    tablero[0][1] = 20
    tablero[0][2] = 30

    println("Lista Inmuttables y mutables")
}
