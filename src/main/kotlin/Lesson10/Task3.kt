package org.example.Lesson10

fun main() {
    print("Enter the desired password length: ")
    val length = readln().toIntOrNull()

    if (length == null || length <= 0) {
        println("Invalid input. Please enter a positive number.")
        return
    }

    val password = generatePassword(length)
    println("Generated password: $password")
}

fun generatePassword(length: Int): String {
    val digits = ('0'..'9')
    val specialChars = listOf('!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ' ')

    val password = StringBuilder()

    for (i in 0 until length) {
        password.append(
            if (i % 2 == 0) digits.random() else specialChars.random()
        )
    }

    return password.toString()
}
