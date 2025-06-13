package org.example.Lesson20

fun main() {
    val playerWithKey = Player1(hasKey = true)
    val playerWithoutKey = Player1(hasKey = false)

    val checkDoorStatus: (Player1) -> String = { player ->
        if (player.hasKey) "The player opened the door"
        else "The door is locked"
    }

    println(checkDoorStatus(playerWithKey))
    println(checkDoorStatus(playerWithoutKey))
}

class Player1(val hasKey: Boolean)
