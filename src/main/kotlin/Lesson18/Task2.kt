package org.example.Lesson18

import kotlin.random.Random

fun main() {
    val diceList: List<Dice> = listOf(
        D4Dice(),
        D6Dice(),
        D8Dice(),
        D6Dice(),
        D4Dice()
    )

    println("Rolling all dice:")
    diceList.forEach { it.roll() }
}

open class Dice(private val sides: Int) {
    open fun roll() {
        val result = Random.nextInt(1, sides + 1)
        println("Rolled a $sides-sided die: $result")
    }
}

class D4Dice : Dice(4)

class D6Dice : Dice(6)

class D8Dice : Dice(8)
