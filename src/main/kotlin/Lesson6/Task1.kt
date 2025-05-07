package org.example.Lesson6

fun main() {
    println("Welcome! Let's create your account.")
    print("Create a username: ")
    val registeredUsername = readln()

    print("Create a password: ")
    val registeredPassword = readln()

    println("\nAccount created successfully! Please log in.\n")

    while (true) {
        print("Enter your username: ")
        val inputUsername = readln()

        print("Enter your password: ")
        val inputPassword = readln()

        if (inputUsername == registeredUsername && inputPassword == registeredPassword) {
            println("Authorization successful.")
            break
        } else {
            println("Incorrect login or password. Please try again.\n")
        }
    }
}
