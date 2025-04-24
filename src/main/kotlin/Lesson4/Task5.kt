package org.example.Lesson4

fun main() {
    print("Is there any damage to the case (true/false): ")
    val isDamaged = readln().toBoolean()

    print("Enter the current crew: ")
    val crew = readln().toInt()

    print("Enter the number of boxes of provisions: ")
    val boxesProvisions = readln().toInt()

    print("Is the weather favorable (true/false): ")
    val goodWeather = readln().toBoolean()

    val canSail =
        (!isDamaged && crew in MIN_CREW..MAX_CREW && boxesProvisions > MIN_PROVISIONS && (goodWeather || !goodWeather)) ||
                (isDamaged && crew == MAX_CREW && boxesProvisions >= MIN_PROVISIONS && goodWeather)

    println("Can the ship sail: $canSail")
}

const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_PROVISIONS = 50