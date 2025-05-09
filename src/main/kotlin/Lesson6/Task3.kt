package org.example.Lesson6

fun main() {
    print("Enter the number of seconds to wait: ")
    var seconds = readln().toIntOrNull()

    if (seconds == null || seconds <= 0) {
        println("Invalid input. Please enter a positive number.")
        return
    }

    println("Timer started for $seconds seconds...")
    while (seconds > 0) {
        println("Seconds left: ${seconds--}...")
        Thread.sleep(1000)
    }

    println("Time's up!")
}
