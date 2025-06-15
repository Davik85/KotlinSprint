package org.example.Lesson22

fun main() {
    val user = UserProfile(name = "Alice", age = 28, email = "alice@gmail.com")

    val (name, age, email) = user

    println("Name: $name")
    println("Age: $age")
    println("Email: $email")
}

data class UserProfile(val name: String, val age: Int, val email: String)
