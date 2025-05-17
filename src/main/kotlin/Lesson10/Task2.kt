package org.example.Lesson10

fun main() {
    print("Create a username: ")
    val userName = readln()

    print("Create a password: ")
    val password = readln()

    if (isValid(userName) && isValid(password)) {
        println("Welcome! Your account has been created.")
    } else {
        println("Username or password is too short.")
    }
}

fun isValid(input: String): Boolean {
    return input.length >= 4
}
