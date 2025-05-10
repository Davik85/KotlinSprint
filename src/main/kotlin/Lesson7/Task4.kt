package org.example.Lesson7

fun main() {
    print("Enter the number of seconds to wait: ")
    val totalSeconds = readln().toIntOrNull()

    if (totalSeconds == null || totalSeconds <= 0) {
        println("Invalid input. Please enter a positive number.")
        return
    }

    for (secondsLeft in totalSeconds downTo 1) {
        println("Seconds left: $secondsLeft")
        Thread.sleep(1000)
    }

    println("Time's up.")
}