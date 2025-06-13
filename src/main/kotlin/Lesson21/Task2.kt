package org.example.Lesson21

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    println("Sum of even numbers: ${numbers.evenNumbersSum()}")
}

fun List<Int>.evenNumbersSum(): Int {
    return this.filter { it % 2 == 0 }.sum()
}