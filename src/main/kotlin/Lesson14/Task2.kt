package org.example.Lesson14

fun main() {
    val liner = LinerShip("Ocean Dream")
    val cargo = CargoShipV2("Steel Titan")
    val icebreaker = IcebreakerV2("Frozen Voyager")

    val fleet = listOf(liner, cargo, icebreaker)

    fleet.forEach {
        it.printInfo()
        it.load()
        println()
    }
}

open class LinerShip(
    open val name: String,
    open val speed: Int = 30,
    open val capacity: Int = 300
) {
    open fun load() {
        println("$name: Deploying horizontal gangway from the deck.")
    }

    open fun printInfo() {
        println("Ship: $name | Speed: $speed knots | Capacity: $capacity passengers")
    }
}

class CargoShipV2(
    override val name: String,
    val cargoCapacity: Int = 10000
) : LinerShip(name, speed = 20, capacity = 50) {

    override fun load() {
        println("$name: Activating loading crane.")
    }

    override fun printInfo() {
        super.printInfo()
        println("Cargo capacity: $cargoCapacity tons")
    }
}

class IcebreakerV2(
    override val name: String,
    val canBreakIce: Boolean = true
) : LinerShip(name, speed = 15, capacity = 80) {

    override fun load() {
        println("$name: Opening stern gates for loading.")
    }

    override fun printInfo() {
        super.printInfo()
        println("Can break ice: $canBreakIce")
    }
}
