package org.example.Lesson4

fun main() {
    var weight = 20
    var volume = 80

    println(
        "The cargo with a weight of 20 kg and a volume of 80 liters corresponds to the 'Average' category:" +
                (weight > MIN_WEIGHT && weight <= MAX_WEIGHT && volume < MSX_VOLUME)
    )

    weight = 50
    volume = 100

    println(
        "The cargo with a weight of 50 kg and a volume of 100 liters corresponds to the 'Average' category:" +
                (weight > MIN_WEIGHT && weight <= MAX_WEIGHT && volume < MSX_VOLUME)
    )
}

//Parameters of the "Average" category
const val MIN_WEIGHT = 35 //Not inclusive
const val MAX_WEIGHT = 100 //inclusive
const val MSX_VOLUME = 100 //Not inclusive