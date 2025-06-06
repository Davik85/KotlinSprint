package org.example.Lesson18

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

abstract class Dice(private val sides: Int) {

    fun roll() {
        val result = (1..sides).random()
        println("Rolled a $sides-sided die: $result")
    }
}

class D4Dice : Dice(4)

class D6Dice : Dice(6)

class D8Dice : Dice(8)
