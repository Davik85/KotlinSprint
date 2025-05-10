package org.example.Lesson7

fun main() {
    print("Enter the desired password length (minimum 6): ")
    val length = readln().toIntOrNull()

    if (length == null || length < 6) {
        println("Invalid input. Password must be at least 6 characters long.")
        return
    }

    val digits = ('0'..'9')
    val lowercase = ('a'..'z')
    val uppercase = ('A'..'Z')

    val allChars = digits + lowercase + uppercase

    val mandatoryChars = listOf(
        digits.random(),
        lowercase.random(),
        uppercase.random()
    )

    val remainingChars = List(length - mandatoryChars.size) { allChars.random() }

    val password = (mandatoryChars + remainingChars).shuffled().joinToString("")

    println("Generated password: $password")
}
