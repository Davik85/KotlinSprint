package org.example.Lesson6

fun main() {
    print("Enter the number of seconds to wait: ")
    val seconds = readln().toIntOrNull()

    if (seconds == null || seconds <= 0) {
        println("Invalid input. Please enter a positive number.")
        return
    }

    var remaining = seconds

    println("Timer started for $seconds seconds...")
    while (remaining > 0) {
        println("Seconds left: ${remaining--}...")
        Thread.sleep(1000)
    }

    println("Time's up! $seconds seconds have passed.")
}