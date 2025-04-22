package org.example.Lesson4

fun main() {
    val isSunny: Boolean = true
    val isTentOpen: Boolean = true
    val humidity: Int = 20
    val season: String = "winter"

    val isFavorable = isSunny && isTentOpen && humidity == 20 && season != "winter"

    println("Are the conditions now favorable for the growth of legumes? $isFavorable")
}