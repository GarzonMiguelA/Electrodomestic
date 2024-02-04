package org.example

class Televisio(
    preuBase: Int,
    color: String,
    consum: String,
    pes: Int,
    var mida: Int = 28
) : Electrodomestic(preuBase, color, consum, pes) { //Trucada al pare

    override fun preuFinal(): Int {
        var preuFinal = super.preuFinal()


        preuFinal += when (mida) {
            in 29..32 -> 50
            in 33..42 -> 100
            in 43..50 -> 150
            else -> 200
        }

        return preuFinal
    }
}