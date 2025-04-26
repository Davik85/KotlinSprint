package org.example.Lesson5

fun main() {
    val winningNumbers = List(3) { (0..42).random() }
    val userNumbers = mutableListOf<Int>()

    println("Welcome to the Lottery! Please enter three numbers between 0 and 42.")

    repeat(3) { index ->
        print("Enter number ${index + 1}: ")
        val number = readln().toIntOrNull()

        if (number == null || number !in 0..42) {
            println("Invalid number. Please restart the game and enter numbers between 0 and 42.")
            return
        }

        userNumbers.add(number)
    }

    val matchedNumbers = userNumbers.intersect(winningNumbers)
    val matchCount = matchedNumbers.size

    println("\nChecking your numbers...")

    when (matchCount) {
        3 -> println("Jackpot! You guessed all the numbers!")
        2 -> println("Congratulations! You guessed two numbers and won a major prize!")
        1 -> println("You guessed one number. A consolation prize is yours.")
        else -> println("No matches. Better luck next time!")
    }

    println("Winning numbers were: $winningNumbers")
}