package org.example.Lesson19

fun main() {
    val ship = Spaceship()
    ship.launch()
    ship.land()
    ship.shootAsteroid()
}

class Spaceship {

    fun launch() {
        // TODO: Implement launch logic
        println("Launch initiated.")
    }

    fun land() {
        println("Landing sequence started.")
    }

    fun shootAsteroid() {
        throw NotImplementedError("Shooting logic not implemented yet.")
    }
}
