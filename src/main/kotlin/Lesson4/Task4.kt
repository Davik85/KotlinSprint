package org.example.Lesson4

fun main() {
    val day = 5 // Training day number

    val isArmsAndAbsDay = day % 2 != 0 //odd days - arms and abs
    val isLegsAndBackDay = !isArmsAndAbsDay //Even—numbered days - legs and back

    println(
        """
        |Exercises for the arms: ${isArmsAndAbsDay}
        |Exercises for the legs: ${isLegsAndBackDay}
        |Exercises for the back: ${isLegsAndBackDay}
        |Exercises for the abs: ${isArmsAndAbsDay}""".trimMargin()
    )
}