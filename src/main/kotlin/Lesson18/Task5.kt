package org.example.Lesson18

class Screen {

    fun draw(x: Int, y: Int): String =
        "Draw point at coordinates (Int): ($x, $y)"

    fun draw(x: Float, y: Float): String =
        "Draw point at coordinates (Float): ($x, $y)"

    fun drawCircle(x: Int, y: Int): String =
        "Draw circle at coordinates (Int): ($x, $y)"

    fun drawCircle(x: Float, y: Float): String =
        "Draw circle at coordinates (Float): ($x, $y)"

    fun drawSquare(x: Int, y: Int): String =
        "Draw square at coordinates (Int): ($x, $y)"

    fun drawSquare(x: Float, y: Float): String =
        "Draw square at coordinates (Float): ($x, $y)"
}
