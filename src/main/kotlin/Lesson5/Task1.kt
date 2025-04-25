package org.example.Lesson5

fun main() {
    val number1 = (1..10).random()
    val number2 = (1..10).random()
    val correctAnswer = number1 + number2

    println("To continue, please solve the following: What is $number1 + $number2?")

    val userInput = readln().toIntOrNull()

    if (userInput == correctAnswer) {
        println("Welcome!")
    } else {
        println("Access denied.")
    }
}