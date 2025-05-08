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
            println("Credentials are correct. Prove you're not a bot.\n")

            var attemptsLeft = 3

            while (attemptsLeft > 0) {
                val num1 = (1..9).random()
                val num2 = (1..9).random()
                val correctAnswer = num1 + num2

                println("What is $num1 + $num2?")
                val userAnswer = readln().toIntOrNull()

                if (userAnswer == correctAnswer) {
                    println("Welcome!")
                    return
                } else {
                    attemptsLeft--
                    if (attemptsLeft > 0) {
                        println("Incorrect. Attempts left: $attemptsLeft\n")
                    }
                }
            }

            println("Access denied.")
            return
        } else {
            println("Incorrect login or password. Please try again.\n")
        }
    }
}
