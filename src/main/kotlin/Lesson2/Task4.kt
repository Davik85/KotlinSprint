package org.example.Lesson2

fun main() {
    val buff = 20f
    val decimalBuff = buff / 100
    val crystalOre = 7
    val ironOre = 11
    val crystalWithBuff = (crystalOre * decimalBuff).toInt()
    val ironWithBuff = (ironOre * decimalBuff).toInt()

    println("Additionally extracted crystal ore - $crystalWithBuff")
    println("Additionally extracted iron ore - $ironWithBuff")
}