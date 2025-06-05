package org.example.Lesson18

fun main() {
    val cubeBox = CubeBox(edge = 3.0)
    val rectangularBox = RectangularBox(length = 4.0, width = 3.0, height = 2.0)

    println("Cube box surface area: ${cubeBox.surfaceArea()} square units")
    println("Rectangular box surface area: ${rectangularBox.surfaceArea()} square units")
}

abstract class Box {
    abstract fun surfaceArea(): Double
}

class CubeBox(private val edge: Double) : Box() {
    override fun surfaceArea(): Double {
        return 6 * edge * edge
    }
}

class RectangularBox(
    private val length: Double,
    private val width: Double,
    private val height: Double
) : Box() {
    override fun surfaceArea(): Double {
        return 2 * (length * width + width * height + length * height)
    }
}
