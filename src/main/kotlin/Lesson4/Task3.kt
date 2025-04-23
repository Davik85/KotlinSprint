package org.example.Lesson4

fun main() {
    val isSunny = "Sunny"
    val isTentOpen = "Tent open"
    val humidityAir: Int = 20
    val seasonOfTheYear: String = "winter"

    val isFavorable =
        isSunny == SUNNY && isTentOpen == TENT_OPEN && humidityAir == HUMIDITY && seasonOfTheYear != SEASON

    println("Are the conditions now favorable for the growth of legumes? $isFavorable")
}

const val SUNNY = "Sunny"
const val TENT_OPEN = "Tent open"
const val HUMIDITY: Int = 20
const val SEASON: String = "winter"