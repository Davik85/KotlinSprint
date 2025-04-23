package org.example.Lesson4

fun main() {
    val bookedToday = 13
    val bookedTomorrow = 9

    val availableToday = bookedToday < TOTAL_TABLES
    val availableTomorrow = bookedTomorrow < TOTAL_TABLES

    println("Available tables for today: $availableToday\nAvailable tables for tomorrow: $availableTomorrow")
}

const val TOTAL_TABLES = 13