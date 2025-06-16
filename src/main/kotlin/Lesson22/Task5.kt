package org.example.Lesson22

import java.time.LocalDateTime

const val ALPHA_CENTAURI_NAME = "Alpha Centauri Star System"
const val ALPHA_CENTAURI_DESCRIPTION = "Closest known star system to the Solar System."
val ALPHA_CENTAURI_DATE = LocalDateTime.of(2150, 5, 1, 14, 30)
const val ALPHA_CENTAURI_DISTANCE_LY = 4.37

data class GalacticGuide(
    val title: String,
    val description: String,
    val dateTime: LocalDateTime,
    val distanceFromEarthLy: Double
)

fun main() {
    val alphaCentauri = GalacticGuide(
        title = ALPHA_CENTAURI_NAME,
        description = ALPHA_CENTAURI_DESCRIPTION,
        dateTime = ALPHA_CENTAURI_DATE,
        distanceFromEarthLy = ALPHA_CENTAURI_DISTANCE_LY
    )

    val (title, description, dateTime, distanceFromEarthLy) = alphaCentauri

    println("📍 $title")
    println("📝 $description")
    println("📅 Event Time: $dateTime")
    println("📏 Distance from Earth: $distanceFromEarthLy light-years")
}
