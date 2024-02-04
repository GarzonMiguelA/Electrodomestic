package org.example
import org.example.Electrodomestic

fun main() {
    val electrodomestics = arrayOf(
        Electrodomestic(500, "negre", "A", 10),
        Electrodomestic(600, "blau", "C", 15),
        Electrodomestic(700, "vermell", "E", 25),
        Electrodomestic(800, "groc", "B", 8),
        Electrodomestic(900, "blanc", "D", 30),
        Electrodomestic(1000, "gris", "F", 12),
        Rentadora(1200, "blanc", "A", 20, 5),
        Rentadora(1500, "negre", "C", 25, 8),
        Televisio(2000, "plata", "B", 15, 28),
        Televisio(2500, "negre", "F", 18, 52)
    )

    var preuBaseTotal = 0
    var preuFinalTotal = 0
    var preuBaseRentadores = 0
    var preuFinalRentadores = 0
    var preuBaseTelevisions = 0
    var preuFinalTelevisions = 0

    for (i in electrodomestics.indices) {
        val electrodomestic = electrodomestics[i]
        println("Electrodomèstic ${i + 1}:")
        println("Preu base: ${electrodomestic.preuBase}€")
        println("Color: ${electrodomestic.color}")
        println("Consum: ${electrodomestic.consum}")
        println("Pes: ${electrodomestic.pes}kg")
        println("Preu final: ${electrodomestic.preuFinal()}€")
        println()

        // Actualitzem els totals
        preuBaseTotal += electrodomestic.preuBase
        preuFinalTotal += electrodomestic.preuFinal()

        when (electrodomestic) {
            is Rentadora -> {
                preuBaseRentadores += electrodomestic.preuBase
                preuFinalRentadores += electrodomestic.preuFinal()
            }
            is Televisio -> {
                preuBaseTelevisions += electrodomestic.preuBase
                preuFinalTelevisions += electrodomestic.preuFinal()
            }
        }
    }

    // Mostrem els totals per tipus d'electrodomèstic
    println("Electrodomèstics:")
    println("Preu base: $preuBaseTotal€")
    println("Preu final: $preuFinalTotal€")
    println()

    println("Rentadores:")
    println("Preu base: $preuBaseRentadores€")
    println("Preu final: $preuFinalRentadores€")
    println()

    println("Televisions:")
    println("Preu base: $preuBaseTelevisions€")
    println("Preu final: $preuFinalTelevisions€")
    println()
}