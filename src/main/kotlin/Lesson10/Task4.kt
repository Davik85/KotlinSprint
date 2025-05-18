package org.example.Lesson10

fun main() {
    var userWins = 0

    println("\uD83C\uDFB2 Welcome to the Dice Game: Human vs. Machine!")

    do {
        val result = playRound()
        if (result == "user") {
            userWins++
        }

        print("Do you want to roll the dice again? Enter Yes or No: ")
        val continuePlaying = readln()

    } while (continuePlaying.equals("yes", ignoreCase = true))

    println("Game over! You won $userWins round(s).")
}

fun rollDice(): Int {
    return (1..6).random()
}

fun playRound(): String {
    val userRoll = rollDice()
    val computerRoll = rollDice()

    println("You rolled: $userRoll")
    println("The Matrix rolled: $computerRoll")

    return when {
        userRoll > computerRoll -> {
            println("\uD83D\uDC64You win this round!\n")
            "user"
        }

        userRoll < computerRoll -> {
            println("\uD83E\uDD16The Matrix wins this round.\n")
            "computer"
        }

        else -> {
            println("\uD83E\uDD1DIt's a tie!\n")
            "draw"
        }
    }
}
