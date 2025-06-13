package org.example.Lesson21

fun main() {
    val player = Player2(name = "Arthas", currentHealth = 100, maxHealth = 100)
    println("${player.name} is healthy: ${player.isHealthy()}")

    player.currentHealth = 75
    println("${player.name} is healthy: ${player.isHealthy()}")
}

class Player2(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int
)

fun Player2.isHealthy(): Boolean {
    return currentHealth == maxHealth
}