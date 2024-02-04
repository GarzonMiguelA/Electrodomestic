package org.example

open class Electrodomestic () {

    var preuBase: Int = 0
    var color:String = "blanc"
    var consum: String = "G"
    var pes:Int = 5

    constructor(preuBase: Int, color: String, consum: String, pes: Int) : this() {
        this.preuBase = preuBase
        this.color = color
        this.consum = consum
        this.pes = pes
    }

    open fun preuFinal(): Int { //open permite que las clases hijos hereden y sobrescriban esta función
        var preuFinal = preuBase

        // Añadir costo por consum
        preuFinal += when (consum.uppercase()) {
            "A" -> 35
            "B" -> 30
            "C" -> 25
            "D" -> 20
            "E" -> 15
            "F" -> 10
            else -> 0
        }

        preuFinal += when {
            pes >= 6 && pes <= 20 -> 20
            pes <= 50 -> 50
            pes <= 80 -> 80
            else -> 100
        }

        return preuFinal
    }

}