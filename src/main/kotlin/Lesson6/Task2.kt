package org.example.Lesson6

fun main() {
    print("Enter the number of seconds to wait: ")
    val seconds = readln().toIntOrNull()

    if (seconds == null || seconds <= 0) {
        println("Invalid input. Please enter a positive number.")
        return
    }

    println("Timer started for $seconds seconds...")
    Thread.sleep(seconds * 1000L)
    println("Time's up! $seconds seconds have passed.")
}
