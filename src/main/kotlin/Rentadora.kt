package org.example

class Rentadora(
    preuBase: Int,
    color: String,
    consum: String,
    pes: Int,
    var càrrega: Int = 5
) : Electrodomestic(preuBase, color, consum, pes) { //: Electrodomestic, es la trucada que fem desde el fill al pare

    override fun preuFinal(): Int {
        var preuFinal = super.preuFinal()


        preuFinal += when (càrrega) {
            in 6..7 -> 55
            8 -> 70
            9 -> 85
            10 -> 100
            else -> 0
        }

        return preuFinal
    }
}
