package org.example.Lesson6

fun main() {
    val secretNumber = (1..9).random()
    val maxAttempts = 5
    var attemptsLeft = maxAttempts

    println("Welcome to the number guessing game!")
    println("Guess the number between 1 and 9. You have $maxAttempts attempts.")

    while (attemptsLeft > 0) {
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
            attemptsLeft--
            if (attemptsLeft > 0) {
                println("Wrong guess. Attempts left: $attemptsLeft")
            }
        }
    }

    println("Out of attempts! The number was $secretNumber.")
}
