package org.example.Lesson10

fun main() {
    println("🎲 Dice Game: Human vs. Machine")

    println("\nHuman is rolling the dice...")
    val humanRoll = rollDice()
    println("Human rolled: $humanRoll")

    println("\nComputer is rolling the dice...")
    val computerRoll = rollDice()
    println("Computer rolled: $computerRoll")

    println()

    when {
        humanRoll > computerRoll -> println("👤 Humanity wins!")
        humanRoll < computerRoll -> println("🤖 The Matrix wins!")
        else -> println("🤝 It's a tie!")
    }
}

