package org.example.Lesson2

const val BUFF = 0.2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val crystalWithBuff = (crystalOre * BUFF).toInt()
    val ironWithBuff = (ironOre * BUFF).toInt()

    println("Additionally extracted crystal ore - $crystalWithBuff")
    println("Additionally extracted iron ore - $ironWithBuff")
}