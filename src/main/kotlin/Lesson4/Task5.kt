package org.example.Lesson4

fun main() {
    print("Is there any damage to the case (true/false): ")
    val hasDamage = readln().toBoolean()

    print("Enter the current crew: ")
    val crew = readln().toInt()

    print("Enter the number of boxes of provisions: ")
    val boxesProvisions = readln().toInt()

    print("Is the weather favorable (true/false): ")
    val goodWeather = readln().toBoolean()

    val canSail =
        (!hasDamage && crew in 55..70 && boxesProvisions > 50 && (goodWeather || !goodWeather)) || (hasDamage && crew == 70 && boxesProvisions >= 50 && goodWeather)

    println("Can the ship sail: $canSail")
}