package org.example.Lesson16

fun main() {
    val circle = Circle(5.0)

    val circumference = circle.calculateCircumference()
    val area = circle.calculateArea()

    println("🔵 Circumference: $circumference")
    println("🔵 Area: $area")
}

class Circle(private val radius: Double) {

    companion object {
        private const val PI = 3.14
    }

    fun calculateCircumference(): Double {
        return 2 * PI * radius
    }

    fun calculateArea(): Double {
        return PI * radius * radius
    }
}
