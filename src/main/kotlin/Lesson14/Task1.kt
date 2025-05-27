package org.example.Lesson14

fun main() {
    val liner = Liner(name = "Ocean Breeze")
    val cargoShip = CargoShip(name = "Freight Titan")
    val icebreaker = Icebreaker(name = "Arctic Spirit")

    liner.printInfo()
    println()

    cargoShip.printInfo()
    println("Cargo capacity: ${cargoShip.cargoCapacity} tons\n")

    icebreaker.printInfo()
    println("Can break ice: ${icebreaker.canBreakIce}")
}

open class Liner(
    open val name: String,
    open val speed: Int = 30,
    open val capacity: Int = 300
) {
    fun printInfo() {
        println("Ship: $name | Speed: $speed knots | Capacity: $capacity passengers")
    }
}

class CargoShip(
    override val name: String,
    val cargoCapacity: Int = 10000
) : Liner(name, speed = 20, capacity = 50)

class Icebreaker(
    override val name: String,
    val canBreakIce: Boolean = true
) : Liner(name, speed = 15, capacity = 80)

