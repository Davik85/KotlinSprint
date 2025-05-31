package org.example.Lesson16

import kotlin.random.Random

fun main() {
    val dice = Dice()
    dice.reveal()
}

class Dice {
    private val value: Int = Random.nextInt(1, 7)

    fun reveal() {
        println("The dice shows: $value")
    }
}