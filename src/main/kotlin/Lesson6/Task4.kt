package org.example.Lesson6

fun main() {
    var maxAttempts = 5
    val secretNumber = (1..9).random()

    println("Welcome to the number guessing game!")
    println("Guess the number between 1 and 9. You have $maxAttempts attempts.")

    do {
        print("Enter your guess: ")
        val guess = readln().toIntOrNull()

        if (guess == null || guess !in 1..9) {
            println("Invalid input. Please enter a number between 1 and 9.")
            continue
        }

        if (guess == secretNumber) {
            println("That was a magnificent game!")
            return
        } else {
            --maxAttempts
            if (maxAttempts > 0) {
                println("Wrong guess. Attempts left: $maxAttempts")
            }
        }
    } while (maxAttempts > 0)

    println("Out of attempts! The number was $secretNumber.")
}

