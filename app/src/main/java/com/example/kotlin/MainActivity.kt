package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //variablesYConstantes()
        //sentenciaIf()
        sentenciaWhen()
    }

    // Variables y Constantes




}

    private fun variablesYConstantes(){

            var myFirstVariable = "esta es una prueba"
            var myFirtNumber = 10000
            var mySecondVariable = "Segunda parte de la prueba"
            println(myFirstVariable)
            println(myFirtNumber)

            println(mySecondVariable)

        //Constantes

            val myFirstConstante = "Seguimos con la prueba"

            println(myFirstConstante)

        //Tipos de datos String Enteros decimales y booleanos

        val myString3 =myFirstVariable + " "  + mySecondVariable

            println(myString3)

        //Enteros = Byte -127 +128  short -32768 +32767 Int  Long

        val myInt  = 100
        val myInt2 = 200
        val myInt3 = myInt + myInt2

        println(myInt3)

        // Decimales Float 32 bit Double 64 bit

        val myFloat = 100.5
        val myFloat2 = 199.5
        val myInt10 = 10
        val myFloat3 = myFloat + myFloat2 + myInt10
        println (myFloat3)

        // Boolean (bool)

        val myBool = true
        val myBool1 = false

        println(myBool)
    }
// Operador condicionales  < > <= >= == !=
    private fun sentenciaIf() {

    val myNumber = 7

    if (myNumber <= 10 && myNumber > 5) {
        println("$myNumber es menor o igual que 10 y mayor que 5")
    } else {
        println("$myNumber es mayor que 10 o menor o igual que 5")


        // Operadores logicos Y && O ||
        //When
    }
}
       fun sentenciaWhen() {

            val country = "FRANCIA"

            when (country) {
                "Guatemala" -> {
                    println("El idioma es Español")
                }
                "Nicaragua" -> {
                    println("El idioma es Español")
                }
                "USA" -> {
                    println("El idioma es Ingles")
                }
                else -> {
                    println("No conocemos el idioma")
                }
            }

           // When con int

           val edad = 16

           when (edad) {

               0,2,3 -> {
                   println("Eres un bebé")
               }in 4..10 -> {
               println("Eres un niño")
               }in 11..16 -> {
               println("Eres un adolescente")
           }else -> {
               println("no aplica")}

           }

        }



