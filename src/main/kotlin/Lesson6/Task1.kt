package org.example.Lesson6

fun main() {
    println("Welcome! Let's create your account.")
    print("Create a username: ")
    val registeredUsername = readln()

    print("Create a password: ")
    val registeredPassword = readln()

    println("\nAccount created successfully! Please log in.\n")

    var inputUsername: String
    var inputPassword: String

    do {
        print("Enter your username: ")
        inputUsername = readln()

        print("Enter your password: ")
        inputPassword = readln()

        if (inputUsername != registeredUsername || inputPassword != registeredPassword) {
            println("Incorrect login or password. Please try again.\n")
        }
    } while (inputUsername != registeredUsername || inputPassword != registeredPassword)

    println("Authorization successful.")
}

