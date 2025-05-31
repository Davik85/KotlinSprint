package org.example.Lesson16

fun main() {
    val user = User("Snake", "secure123")

    val input = "secure123"
    val result = user.isPasswordCorrect(input)

    println("✅ Password correct: $result")
}

class User(private val login: String, private val password: String) {
    fun isPasswordCorrect(input: String) = input == password
}
