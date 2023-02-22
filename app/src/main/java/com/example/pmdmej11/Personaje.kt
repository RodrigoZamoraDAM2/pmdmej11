package com.example.pmdmej11

import java.io.Serializable

class Personaje : Serializable {


    var fuerza = 0
    var defensa = 0
    var vida = 0
    var monedero  = 0
    var pesoMochila = 0
    var mochila = ArrayList<Objeto>()

    constructor(fuerza : Int,defensa : Int, vida : Int, pesoMochila : Int){
        this.fuerza = fuerza
        this.defensa = defensa
        this.vida = vida
        this.pesoMochila = pesoMochila
    }

    fun meterEnMochila(obj : Objeto){
        mochila.add(obj)
    }

    fun sacarDeMochila(obj: Objeto){
        mochila.removeAt(mochila.indexOf(obj))
    }

    fun calcularPeso() : Int{
        var acum = 0
        for (obj in mochila){
            acum += obj.peso
        }
        return acum
    }

}