package com.example.miprimeraplicacion

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //validaredad()
        //tablamulti()
        //listado()
        propiedadesAutomoviles()
    }

    //Validar si una persona es mayor o menor de edad
    fun validaredad(){
        val edad = 20
        if(edad < 18){
            println("Usted es menor de edad")
            }else{
            println("Usted es mayor de edad")
        }
    }
    //Presentar la tabla de multiplicar de n numero de forma ascendente y descendente.
    fun tablamulti(){
        val num = 2
        println("Tabla del $num en forma ascendente: ")
        for(i in 1..12){
            println("$num x $i = ${num * i}")
        }
        println("Tabla del $num en forma descendente: ")
        for(i in 12 downTo 0){
                println("$num * $i = " + num * i)
            }
        }
    //Mostrar el listado de paralelo de la materia de Plataformas móviles y los subgrupos por proyectos (Mostrar los resultados ordenados).
    fun listado(){
        val estudiantes = listOf<String>("Andres Jimenez","Joselo Ordoñez","Diego Leiva", "Erick Cuenca",
            "Mateo Martinez","Carlos Castillo")
        val subgrupos = mutableMapOf("Andres Jimenez" to "Funeraria Mascotas","Joselo Ordoñez" to "Registro UTPL",
            "Diego Leiva" to "Funeraria Mascotas", "Erick Cuenca" to "Funeraria Mascotas", "Mateo Martinez" to "Registro UTPL",
            "Carlos Castillo" to "Registro UTPL")

        val grupoOrdenado = subgrupos.toSortedMap()
        println("---Listado del Paralelo por Proyectos---")
        for (i in grupoOrdenado ){
            println("${i.key} - ${i.value}")
        }
    }
    //Presentar las propiedades de un vehículo utilizando clases, como tracción, motor, tipo de vehículo, capacidad
    class propiedade(val traccion:Array<Traccion>,val motor:String,val tipo:String,val capacidad:Int){
        enum class Traccion{
            Delantero,
            Trasero
        }
        fun code(){
            for (i in traccion){
                println("El vehiculo tiene las siguientes caracteristicas" + i)
            }
        }
    }
    fun propiedadesAutomoviles(){
        val automovil = propiedade(arrayOf(propiedade.Traccion.Delantero),motor = "Diésel", tipo = "Todoterreno", capacidad = 4)
        println("Automovil")
        println("Motor: ${automovil.motor} \n Capacidad: ${automovil.capacidad}\"")
        automovil.code()
    }

}