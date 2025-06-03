package org.example.Lesson17

fun main() {
    val ship = Ship(name = "Neptune", averageSpeed = 25.0, homePort = "Port Royal")

    ship.printInfo()

    println("\nAttempting to rename the ship...")
    ship.name = "Poseidon"

    println("\nAfter rename attempt:")
    ship.printInfo()
}

class Ship(name: String, var averageSpeed: Double, var homePort: String) {

    private var _name: String = name

    var name: String
        get() = _name
        set(_) {
            println("Ship name cannot be changed!")
        }

    fun printInfo() {
        println("Ship name: $name")
        println("Home port: $homePort")
        println("Average speed: $averageSpeed knots")
    }
}
