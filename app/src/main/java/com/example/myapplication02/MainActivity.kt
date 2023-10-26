package com.example.myapplication02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /********** Operaciones basicas semana 3 ***********
        /************* lenguaje de aplicacion **************/

        var variable = "------------------ Hola mundo:)"
        println(variable)

        val prueba = "---------------- prueba"
        println(prueba)

        val n1 = "---------------- hola:"
        println(n1)

        val n11 = "---------------- hola:"
        println(n11)

        val myString = "Hola android"
        val myString2 = "Desarrollo de plataformas moviles"
        val myString3 = myString + "" + myString2
        println(myString3)
        //enteros(byte,short, int, long)

        //

        //
        val country ="colombia"
        when(country){
        "Ecuador","colombia","peru"->{
        println("idioma Español")}
        "EEUU"->{
        println("Idioma ingles")}
        "Francia"-> {
        println("idioma frances")}
        }
        /*** variables tipo array **/
        val name= "Jamil"
        val surname= "Quituizaca"
        val university="UTPL"
        val age= "21"
        val myArray= arrayListOf<String>()
        myArray.add(name)
        myArray.add(surname)
        myArray.add(university)
        myArray.add(age)

        println(myArray)

        //elimina los datos de la array
        myArray.removeAt(4)
        println(myArray)
        //recorre la array
        myArray.forEach{
        println(it)
        }
        //otras operaciones
        println(myArray.count())
        myArray.clear()
        println(myArray.count())

        myArray.first()
        myArray.last()
        myArray.sort()

        /**
        //declarar variables tipo mapa como json

        val myMap: Map<String,int> = mapOf()
        //agregar elementos
        myMap= mutableMapOf("jamil"to 1, "pedro"to 2, "juan"to 5)
        println(myMap)
        myMap["jamil"]
        myMap["pedro"]
        myMap["juan"]


        **/
         ****/


        /***** Trabajo en clase *****/
        /** 1. Algoritmo de cedula **/

        val cedula = "1105595985"
        val multiplicadores = intArrayOf(2, 1, 2, 1, 2, 1, 2, 1, 2)

        if (cedula.length != multiplicadores.size) {
            println("La cédula y los multiplicadores deben tener la misma longitud")
            return
        }

        var resultado = 0

        for (i in cedula.indices) {
            val digitoCedula = cedula[i].toString().toInt()
            val digitoMultiplicador = multiplicadores[i]
            var multiplicacion = digitoCedula * digitoMultiplicador

            if (multiplicacion > 9) {
                // Si el resultado de la multiplicación es mayor a 9, sumamos los dígitos entre sí
                multiplicacion = (multiplicacion % 10) + (multiplicacion / 10)
            }

            resultado += multiplicacion
        }

        // Encontramos el número más alto en la cédula
        val numeroMasAlto = cedula.maxByOrNull { it.toString().toInt() }.toString().toInt()

        // Restamos el resultado de la suma a númeroMasAlto redondeado
        val resultadoFinal = numeroMasAlto - resultado

        if (resultadoFinal == 5) {
            println("La cédula es válida")
        } else {
            println("La cédula no es válida")
        }


        /**Ejercicio2**/

        fun ejemplo2() {
            val array =
                arrayOf(2, 5, 7, 15, 96, 41, 5, 8, 10, 14, 27, 35, 62, 45, 24, 14, 42, 15, 63)

            val listaPar = mutableListOf<Int>()
            val listaImpar = mutableListOf<Int>()

            for (numero in array) {
                if (numero % 2 == 0) {
                    listaPar.add(numero)
                } else {
                    listaImpar.add(numero)
                }
            }

            println("[Lista Par] $listaPar")
            println("[Lista Impar] $listaImpar")
        }

        /** Ejercicio3**/
            val personas = listOf(
                Person("Jaxier", "1900691161", 80, "soltero"),
                Person("Marco", "1900691161", 30, "casado"),
                Person("Jamil", "1900691161", 65, "soltero"),
                Person("Luisa", "1900691161", 58, "soltero"),
                Person("Maria", "1900691161", 10, "divorciado")
            )

            val mayoresDeEdadSolteros = personas
                .filter { it.edad > 60 && it.estadoCivil.equals("soltero", ignoreCase = true) }

            if (mayoresDeEdadSolteros.isEmpty()) {
                println("No hay personas mayores de 60 años con estado civil 'soltero'.")
            } else {
                println("Personas mayores de 60 años con estado civil 'soltero':")
                mayoresDeEdadSolteros.forEach { persona ->
                    println("Nombre: ${persona.nombre}, Cédula: ${persona.cedula}, Edad: ${persona.edad}")
                }
            }



    }
    data class Person(
        val nombre: String,
        val cedula: String,
        val edad: Int,
        val estadoCivil: String
    )
}