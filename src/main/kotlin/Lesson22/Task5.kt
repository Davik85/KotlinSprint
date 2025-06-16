package org.example.Lesson22

import java.time.LocalDateTime

private const val ALPHA_CENTAURI_NAME = "Alpha Centauri"
private const val ALPHA_CENTAURI_DESCRIPTION = "A nearby star system with potential habitable planets."
private val ALPHA_CENTAURI_DATE: LocalDateTime = LocalDateTime.of(2150, 5, 1, 14, 30)
private const val ALPHA_CENTAURI_DISTANCE = 4.37

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: LocalDateTime,
    val distanceFromEarth: Double
)

fun main() {
    val alphaCentauri = GalacticGuide(
        name = ALPHA_CENTAURI_NAME,
        description = ALPHA_CENTAURI_DESCRIPTION,
        dateTime = ALPHA_CENTAURI_DATE,
        distanceFromEarth = ALPHA_CENTAURI_DISTANCE
    )

    val name = alphaCentauri.component1()
    val description = alphaCentauri.component2()
    val dateTime = alphaCentauri.component3()
    val distance = alphaCentauri.component4()

    println("Galactic Event:")
    println("Name: $name")
    println("Description: $description")
    println("Date and Time: $dateTime")
    println("Distance from Earth: $distance light-years")
}
