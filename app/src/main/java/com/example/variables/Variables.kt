package com.example.variables


/**
 * Project: Variables
 * From: com.example.variables
 * Created by: pechm
 * On: 03/06/2026
 * All rights reserved: 2026
 */

// Diferencia de que no exite las constantes en kotlin
/*
    Que los tipos de variable con val que se puede sobreescribir
    y los var no se pueden sobreescribir
    Kotlin es de lenguaje sobre tipado dinamico
 */
fun main(){
    /*
    val saludo1 = "Hola mundos"
    println(saludo1)

    var saludo2 = "Como estas"
    println(saludo2)
*/

    var variableUno: Boolean? = true
    variableUno = false;
    println(variableUno)


    val variableDos: Int = 10
    println(variableDos)

    // -9223372036854775807L
    val variableTres: Long = 1000_000_000L
    println(variableTres)

    /*
        Cuando se declara algo en kotlin y tiene punto decimal es un doble
        si es un float es necesario poner una f al final
    */
    val variableCuatro: Float = 3.1416F
    println(variableCuatro)

    val variableCinco: Double = 3.1416
    println(variableCinco)

    val variableSeis: Char = 'a'
    println(variableSeis)
}
