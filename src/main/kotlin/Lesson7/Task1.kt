package org.example.Lesson7

fun main() {
    val letters = ('a'..'z')
    val digits = ('0'..'9')

    val password = buildString {
        repeat(3) {
            append(letters.random())
            append(digits.random())
        }
    }

    println("Generated password: $password")
}