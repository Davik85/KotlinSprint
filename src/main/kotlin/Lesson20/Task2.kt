package org.example.Lesson20

fun main() {
    val player = Player(name = "Max", currentHealth = 60, maxHealth = 100)

    val healPotion: (Player) -> Unit = { target ->
        target.currentHealth = target.maxHealth
        println("${target.name} used a healing potion and now has full health: ${target.currentHealth}/${target.maxHealth}")
    }

    healPotion(player)
}

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int
)
