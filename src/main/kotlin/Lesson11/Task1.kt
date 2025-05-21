package org.example.Lesson11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String
)

fun main() {
    val user1 = User(1, "alex123", "passAlex!", "alex@example.com")
    val user2 = User(2, "julia456", "jPass456", "julia@example.com")

    println("User 1:")
    println("ID: ${user1.id}")
    println("Login: ${user1.login}")
    println("Password: ${user1.password}")
    println("Email: ${user1.email}\n")

    println("User 2:")
    println("ID: ${user2.id}")
    println("Login: ${user2.login}")
    println("Password: ${user2.password}")
    println("Email: ${user2.email}")
}
