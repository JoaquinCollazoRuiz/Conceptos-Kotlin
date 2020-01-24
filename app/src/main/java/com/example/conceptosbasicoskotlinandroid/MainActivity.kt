package com.example.conceptosbasicoskotlinandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //tipoDeDatos()
        //sentenciaIf()
        //sentenciaWhen()
        //arrays()
        //diccionarios()
        //buclesFor()
    }

    private  fun tipoDeDatos(){

        //Strings
        val pruebaString: String = "PRUEBA"
        val pruebaString2 = "PRUEBA2"
        val pruebaString3 = pruebaString + " " + pruebaString2
        println(pruebaString3)

        //Enteros (Byte, Int, Short, Long)
        val pruebaInt: Int = 1
        val pruebaInt2 = 2
        val pruebaInt3 = pruebaInt + pruebaInt2
        println(pruebaInt3)

        //Decimales (Float, Double)
        val pruebaDecimal: Float = 1.2F
        val pruebaDecimal2 = 1.3
        val pruebaDecimal3 = pruebaDecimal + pruebaDecimal2
        println(pruebaDecimal3)

        //Boolean
        val pruebaBool: Boolean = true
        val pruebaBool2 = false
        println(pruebaBool == pruebaBool2)
        println(pruebaBool && pruebaBool2)

    }

    private fun sentenciaIf(){

        val diez = 10
        println("$diez es menor que 20")

        //Operadores condicionales
        // > mayor que
        // < menor que
        // >= mayor o igual que
        // <= menor o igual que
        // == igual que
        // != desigualdad

        //Operadores lógicos
        // && operador "Y"
        // || operador "O"
        // ! operador "NO"

        if (diez == 10){

            println("El valor de diez es 10")

        }else if (diez == 11){

            println("El valor de diez es $diez+1 = 11")

        }else{

            println("El valor de diez es $diez ")

        }
    }

    private fun sentenciaWhen(){

        val letra = "A"

        when (letra){
            "A" -> {
                println("La letra es A")
            }
            "B" -> {
                println("La letra es B")
            }
            "C" -> {
                println("La letra es C")
            }
            else -> {
                println("La letra no es A,B,C")
            }
        }

        val edad = 1

        when (edad){
            1,2,3 -> {
                println("Es un bebé")
            }
            in 3..10 -> {
                println("Es un niño")
            }
            else -> {
                println("Tienes más de 10 años")
            }

        }
    }

    private fun arrays(){

        val nombre = "Joaquin"
        val apellido = "Collazo"
        val edad = "20"

        val joaquin = arrayListOf<String>()

        //Añadir datos de uno en uno
        joaquin.add(nombre)
        joaquin.add(apellido)
        joaquin.add(edad)

        println(joaquin)

        //Aádir conjunto de datos
        joaquin.addAll(listOf("Añadimos", "Valores"))
        println(joaquin)

        //Acceso de datos
        val nombreJoaquin = joaquin[0]
        println(nombreJoaquin)

        //Modificación de datos
        joaquin[3] = "SustituimosPorAñadimos"

        //Eliminar datos
        joaquin.removeAt(3)
        println(joaquin[3])

        //Recorrer datos it -> se va a corresponder con cada string que tenemos dentro de nuestro array
        joaquin.forEach{
            println(it)
        }

        //Número de elementos de un array
        joaquin.count()

        //Mirar primer valor del array
        joaquin.first()

        //Último valor dentro de nuestro array
        joaquin.last()

        //Ordenar por órden alfabético
        joaquin.sort()

        //Vaciar array por completo
        joaquin.clear()

    }

    private fun diccionarios(){

        //Sintaxis
        var mapa: Map< String, Int> =  mapOf()

        //Añadir elementos a mapa vacio
        mapa = mutableMapOf("Joaquin" to 20, "Eduardo" to 21, "Miguel" to 32, "Sara" to 5)
        println(mapa)

        //Añadir un elemento a un mapa con datos
        mapa["David"] = 52
        mapa.put("Luis", 8)
        println(mapa)

        //Acceso a un dato
        println(mapa["Joaquin"])

        //Actualizacion de un dato
        mapa.put("Joaquin", 21)
        println(mapa)

        //Eliminar un dato
        mapa.remove("Joaquin")
        println(mapa)





    }

    private fun buclesFor(){

        val arrayB = listOf<String>("A", "B", "C")
        val mapB = mutableMapOf<String, Int>("Joaquin" to 20 , "Sergio" to 14, "Alberto" to 17)

        //For: contenidoArrayB->("A", "B", "C") , arrayB lo que queremos recorrer
        for (contenidoArrayB in arrayB){
            println(arrayB)
        }

        for (contenidoMapB in mapB){
            println("${contenidoMapB.key} y ${contenidoMapB.value}" )
        }

        for (x in 0..10){
            println(x)
        }

        for (x in 0 until 11){
            println(x)
        }

        for (x in 0..10 step 2){
            println(x)
        }

        for (x in 10 downTo 0){
            println(x)
        }

        for (x in 10 downTo 0 step 2){
            println(x)
        }

    }

    private fun buclesWhile(){

        var x = 0

        while (x < 10){
            println(x)
            x++
        }

    }
}
