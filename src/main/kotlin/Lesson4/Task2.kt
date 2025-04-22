package org.example.Lesson4

fun main() {
    //Parameters of the "Average" category
    val minWeight = 35 //Not inclusive
    val maxWeight = 100 //inclusive
    val maxVolume = 100 //Not inclusive

    println("The cargo with a weight of 20 kg and a volume of 80 liters corresponds to the 'Average' category:" + (20 > minWeight && 20 <= maxWeight && 80 < maxVolume))

    println("The cargo with a weight of 50 kg and a volume of 100 liters corresponds to the 'Average' category:" + (50 > minWeight && 50 <= maxWeight && 100 < maxVolume))
}