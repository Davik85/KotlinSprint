package org.example.Lesson5

fun main() {
    //Winning number
    val winningNumber1 = 22
    val winningNumber2 = 37

    //user input
    println("Enter your first number (from 0 to 42):")
    val userNumber1 = readln().toIntOrNull()

    println("Enter your second number (from 0 to 42):")
    val userNumber2 = readln().toIntOrNull()

    if (userNumber1 == null || userNumber2 == null) {
        println("Invalid input. Please enter valid numbers.")
        return
    }

    //Check win conditions
    val isExactMatch = (userNumber1 == winningNumber1 && userNumber2 == winningNumber2) ||
            (userNumber1 == winningNumber2 && userNumber2 == winningNumber1)

    val isOneMatch = userNumber1 == winningNumber1 || userNumber2 == winningNumber2 ||
            userNumber1 == winningNumber2 || userNumber2 == winningNumber1

    println("The winning numbers were: $winningNumber1 and $winningNumber2")

    when {
        isExactMatch -> println("Congratulations! You won the grand prize!")
        isOneMatch -> println("You won a consolation prize!")
        else -> println("No luck!")
    }
}