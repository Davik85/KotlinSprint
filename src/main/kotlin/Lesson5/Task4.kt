package org.example.Lesson5

fun main() {
    val registeredUsername = "Zaphod"
    val registeredPassword = "PanGalactic"

    println("Hello. I am Marvin... the Paranoid Android.")
    println("Welcome, passenger, to the Heart of Gold... [sigh]")
    println("Please... enter your username, so we can begin the tiresome login process...")

    val inputUsername = readln()

    if (inputUsername != registeredUsername) {
        println("No such user registered... Would you like to register? Well, too bad. [sigh]")
        println("Goodbye...")
        return
    }

    println("I suppose now you'll enter your password... not that it matters to me...")

    val inputPassword = readln()

    if (inputPassword == registeredPassword) {
        println("[sigh] Your credentials are valid... Oh joy.")
        println("User \"$registeredUsername\", you may enter the Heart of Gold.")
        println("Though I doubt you'll enjoy it more than I do... which isn't saying much...")
    } else {
        println("Incorrect password... as expected.")
        println("Access denied. Not that I care.")
    }
}
