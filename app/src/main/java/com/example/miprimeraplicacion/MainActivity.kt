package com.example.miprimeraplicacion

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        validaredad()
        tablamulti()
        listado()
        propiedadesAutomoviles()
        cedula()
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
                println("La traccion del Vehiculo es:" + i)
            }
        }
    }
    fun propiedadesAutomoviles(){
        val carro = propiedade(arrayOf(propiedade.Traccion.Delantero),motor = "Diésel", tipo = "Todoterreno", capacidad = 4)
        println("Automovil")
        carro.code()
        println("Motor: ${carro.motor} \n Tipo: ${carro.tipo} \n Capacidad: ${carro.capacidad}\"")

    }
    //Cedula
    private fun cedula(){
        var cedula = intArrayOf(1,1,0,4,2,5,5,3,8,3)
        var validar = intArrayOf(2,1,2,1,2,1,2,1,2)
        var cont = 0
        var suma = 0
        for (x in validar){
            var res = x * cedula[cont]
            cont += 1
            if (res > 9){
                var aux1 = res.toString()
                res = Character.getNumericValue(aux1.get(0)) + Character.getNumericValue(aux1.get(1))
            }
            suma += res
        }
        if (cedula[9] == (suma % 10) || cedula[9] == 10 - (suma % 10)){
            println("Cedula Correcta")
        }else{
            println("Cedula Incorrecta")
        }
    }
}