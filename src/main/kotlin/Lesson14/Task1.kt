package org.example.Lesson14

fun main() {
    val liner = Liner(name = "Ocean Breeze")
    val cargoShip = CargoShip(name = "Freight Titan")
    val icebreaker = Icebreaker(name = "Arctic Spirit")

    liner.printInfo()
    println()

    cargoShip.printInfo()
    println()

    icebreaker.printInfo()
}

open class Liner(
    open val name: String,
    open val speed: Int = 30,
    open val passengerCapacity: Int = 300,
    open val cargoCapacity: Int = 1000
) {
    open fun printInfo() {
        println("Ship: $name | Speed: $speed knots | Passenger Capacity: $passengerCapacity | Cargo Capacity: $cargoCapacity tons")
    }
}

class CargoShip(
    override val name: String
) : Liner(name, speed = 20, passengerCapacity = 50, cargoCapacity = 10000)

class Icebreaker(
    override val name: String,
    val canBreakIce: Boolean = true
) : Liner(name, speed = 15, passengerCapacity = 80, cargoCapacity = 500) {

    override fun printInfo() {
        super.printInfo()
        println("Can break ice: $canBreakIce")
    }
}


