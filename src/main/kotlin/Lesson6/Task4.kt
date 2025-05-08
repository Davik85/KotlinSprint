package org.example.Lesson6

fun main() {
    val secretNumber = (1..9).random()
    val maxAttempts = 5
    var attempt = 1
    var guess: Int?

    println("Welcome to the number guessing game!")
    println("Guess the number between 1 and 9. You have $maxAttempts attempts.")

    do {
        print("Enter your guess: ")
        guess = readln().toIntOrNull()

        if (guess == null || guess !in 1..9) {
            println("Invalid input. Please enter a number between 1 and 9.")
            continue
        }

        if (guess == secretNumber) {
            println("That was a magnificent game!")
            return
        } else {
            if (attempt < maxAttempts) {
                println("Wrong guess. Attempts left: ${maxAttempts - attempt}")
            }
            attempt++
        }

    } while (attempt <= maxAttempts && guess != secretNumber)

    println("Out of attempts! The number was $secretNumber.")
}

