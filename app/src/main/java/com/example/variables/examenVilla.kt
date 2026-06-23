package com.example.variables
import java.util.Scanner

/**
 * Project: Variables
 * From: com.example.variables
 * Created by: pechm
 * On: 23/06/2026
 * All rights reserved: 2026
 */

data class Participante(var nombre: String, var puntos: Int = 0)

val participantes = mutableListOf<Participante>()

fun main() {
    val scanner = Scanner(System.`in`)
    var opcion: Int

    do {
        println("\n   Menu  ")
        println("1. Registrar participante")
        println("2. Registrar puntos")
        println("3. Consultar participante")
        println("4. Finalizar programa")
        print("Seleccione una opcion: ")

        // Validación para evitar que el programa truene si no ingresan un número
        if (!scanner.hasNextInt()) {
            println("Por favor, ingrese un número válido.")
            scanner.next()
            opcion = 0
            continue
        }

        opcion = scanner.nextInt()
        scanner.nextLine() // Limpiar buffer

        when (opcion) {
            1 -> registrarParticipante(scanner)
            2 -> registrarPuntos(scanner)
            3 -> consultarParticipante(scanner)
            4 -> println("Finalizando programa...")
            else -> println("Opcion inválida.")
        }
    } while (opcion != 4)
}

fun registrarParticipante(scanner: Scanner) {
    print("Ingrese el nombre del participante: ")
    val nombre = scanner.nextLine().trim()

    if (nombre.isEmpty()) {
        println("El nombre no puede estar vacío.")
        return
    }
    if (participantes.any { it.nombre.equals(nombre, ignoreCase = true) }) {
        println("El participante ya esta registrado.")
        return
    }

    participantes.add(Participante(nombre))
    println("Participante '$nombre' registrado exitosamente.")
}

fun registrarPuntos(scanner: Scanner) {
    if (participantes.isEmpty()) {
        println("No hay participantes registrados.")
        return
    }

    print("Ingrese el nombre del participante: ")
    val nombre = scanner.nextLine().trim()
    val participante = participantes.find { it.nombre.equals(nombre, ignoreCase = true) }

    if (participante == null) {
        println("Participante no encontrado.")
        return
    }

    print("Ingrese los puntos a registrar: ")
    if (!scanner.hasNextInt()) {
        println("Puntos invalidos.")
        scanner.next()
        return
    }
    val puntos = scanner.nextInt()
    scanner.nextLine()

    if (puntos <= 0) {
        println("Los puntos deben ser mayores que cero.")
        return
    }

    participante.puntos += puntos
    println("Se registraron $puntos puntos a ${participante.nombre}.")
}

fun consultarParticipante(scanner: Scanner) {
    if (participantes.isEmpty()) {
        println("No hay participantes registrados.")
        return
    }

    print("Ingrese el nombre del participante: ")
    val nombre = scanner.nextLine().trim()
    val participante = participantes.find { it.nombre.equals(nombre, ignoreCase = true) }

    if (participante == null) {
        println("Participante no encontrado.")
        return
    }

    println("\nInformacion del participante")
    println("Nombre: ${participante.nombre}")
    println("Puntos acumulados: ${participante.puntos}")

}


