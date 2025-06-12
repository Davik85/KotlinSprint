package org.example.Lesson20

fun main() {
    val playerWithKey = Player(hasKey = true)
    val playerWithoutKey = Player(hasKey = false)

    val checkDoorStatus: (Player) -> String = { player ->
        if (player.hasKey) "The player opened the door"
        else "The door is locked"
    }

    println(checkDoorStatus(playerWithKey))
    println(checkDoorStatus(playerWithoutKey))
}

class Player(val hasKey: Boolean)
