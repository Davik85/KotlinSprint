package org.example.Lesson2

const val MINUTES_IN_HOUR = 60

fun main() {
    val departureHours = 9
    val departureMinutes = 39
    val travelTime = 457
    val totalMinutes = departureHours * MINUTES_IN_HOUR + departureMinutes + travelTime
    val arrivalHours = totalMinutes / MINUTES_IN_HOUR
    val arrivalMinutes = totalMinutes % MINUTES_IN_HOUR

    println("Arrival time - %02d:%02d".format(arrivalHours, arrivalMinutes))
}