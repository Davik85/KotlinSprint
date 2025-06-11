package org.example.Lesson20

fun main() {
    val robot = Robot()

    robot.say()

    robot.setModifier { it.reversed() }

    robot.say()
}

class Robot {
    private var modifier: ((String) -> String)? = null

    private val phrases = listOf(
        "Darkness is coming",
        "You cannot escape your fate",
        "I see everything",
        "Your end is near",
        "Silence before the storm"
    )

    fun say() {
        val phrase = phrases.random()
        val output = modifier?.invoke(phrase) ?: phrase
        println(output)
    }

    fun setModifier(mod: (String) -> String) {
        modifier = mod
    }
}
