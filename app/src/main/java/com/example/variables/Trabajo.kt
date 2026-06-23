package com.example.variables
import java.util.Scanner

/**
 * Project: Variables
 * From: com.example.variables
 * Created by: pechm
 * On: 10/06/2026
 * All rights reserved: 2026

 */

fun main() {
    val scanner = Scanner(System.`in`)

    println("¿Cuántos vendedores serán registrados?")
    val totalVendedores = scanner.nextInt()


    var sumaTotalGeneral = 0.0
    var vendedorMasVendio = ""
    var ventaMasAlta = 0.0

    var totalExcelente = 0
    var totalBuena = 0
    var totalRegular = 0
    var totalBaja = 0

    for (i in 1..totalVendedores) {
        println("\n--- Vendedor $i ---")
        print("Nombre: ")
        val nombre = scanner.next()

        print("Cantidad de productos vendidos: ")
        val cantidadProductos = scanner.nextInt()

        if (cantidadProductos <= 0) {
            println("Valor inválido: La cantidad debe ser mayor a 0.")
            continue
        }

        var totalVendedor = 0.0
        var errorEnPrecios = false

        for (j in 1..cantidadProductos) {
            print("Precio del producto $j: ")
            val precio = scanner.nextDouble()

            if (precio < 0) {
                println("Valor inválido: El precio no puede ser negativo.")
                errorEnPrecios = true
                break
            }
            totalVendedor += precio
        }


        if (errorEnPrecios) continue

        var categoria = ""
        if (totalVendedor >= 10000) {
            categoria = "Excelente"
            totalExcelente++
        } else if (totalVendedor >= 5000) {
            categoria = "Buena"
            totalBuena++
        } else if (totalVendedor >= 1000) {
            categoria = "Regular"
            totalRegular++
        } else {
            categoria = "Baja"
            totalBaja++
        }

        val mensaje = when (categoria) {
            "Excelente" -> "Bono máximo"
            "Buena" -> "Bono parcial"
            "Regular" -> "Sin bono"
            else -> "Requiere capacitación"
        }

        println("\nResultados de $nombre:")
        println("Total vendido: $$totalVendedor")
        println("Categoría: $categoria")
        println("Mensaje: $mensaje")

        sumaTotalGeneral += totalVendedor

        if (totalVendedor > ventaMasAlta) {
            ventaMasAlta = totalVendedor
            vendedorMasVendio = nombre
        }
    }

    val promedioVentas = if (totalVendedores > 0) sumaTotalGeneral / totalVendedores else 0.0

    println("RESUMEN FINAL DEL DÍA")
    println("Total de vendedores registrados: $totalVendedores")
    println("Suma total de ventas: $$sumaTotalGeneral")
    println("Promedio de ventas por vendedor: $$promedioVentas")
    println("\nCantidad de vendedores por categoría:")
    println("- Excelente: $totalExcelente")
    println("- Buena: $totalBuena")
    println("- Regular: $totalRegular")
    println("- Baja: $totalBaja")
    println("\nMejor rendimiento:")
    println("Vendedor que más vendió: $vendedorMasVendio")
    println("Monto de la venta más alta: $$ventaMasAlta")
}
