package org.example.Lesson5

const val LEGAL_AGE = 18

fun main() {
    val currentYear = 2025

    println("Please enter your year of birth:")

    val birthYear = readln().toIntOrNull()

    if (birthYear != null) {
        val age = currentYear - birthYear

        if (age >= LEGAL_AGE) {
            println("Show screen with hidden content.")
        } else {
            println("Access denied.")
        }
    } else {
        println("Invalid input. Please enter a valid year.")
    }
}