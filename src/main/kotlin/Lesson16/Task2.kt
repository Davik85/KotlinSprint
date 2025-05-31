package org.example.Lesson16

import kotlin.math.pow

private const val PI = 3.14 // File-level constant, fully encapsulated

fun main() {
    val circle = Circle(5.0)

    val circumference = circle.calculateCircumference()
    val area = circle.calculateArea()

    println("🔵 Circumference: $circumference")
    println("🔵 Area: $area")
}

class Circle(private val radius: Double) {

    fun calculateCircumference(): Double {
        return 2 * PI * radius
    }

    fun calculateArea(): Double {
        return PI * radius.pow(2)
    }
}

