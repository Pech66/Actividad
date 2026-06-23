package com.example.variables


/**
 * Project: Variables
 * From: com.example.variables
 * Created by: pechm
 * On: 12/06/2026
 * All rights reserved: 2026
 */


fun main(){
    println("Interrupccion break ")

    for (i in 1..10){
        if(i == 4){
          break
        }
        println("El valor de $i")
    }
}
