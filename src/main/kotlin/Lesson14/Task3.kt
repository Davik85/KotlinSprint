package org.example.Lesson14

const val COLOR_BLACK = "black"
const val COLOR_WHITE = "white"

fun main() {
    val figures = listOf(
        Circle(COLOR_BLACK, 5.0),
        Circle(COLOR_WHITE, 3.0),
        Rectangle(COLOR_WHITE, 4.0, 6.0),
        Rectangle(COLOR_BLACK, 2.5, 7.0)
    )

    val blackPerimeterSum = figures
        .filter { it.color == COLOR_BLACK }
        .sumOf { it.perimeter() }

    val whiteAreaSum = figures
        .filter { it.color == COLOR_WHITE }
        .sumOf { it.area() }

    println("Total perimeter of black figures: %.2f".format(blackPerimeterSum))
    println("Total area of white figures: %.2f".format(whiteAreaSum))
}

abstract class Figure(val color: String) {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

class Circle(color: String, val radius: Double) : Figure(color) {
    override fun area(): Double = Math.PI * radius * radius
    override fun perimeter(): Double = 2 * Math.PI * radius
}

class Rectangle(color: String, val width: Double, val height: Double) : Figure(color) {
    override fun area(): Double = width * height
    override fun perimeter(): Double = 2 * (width + height)
}
