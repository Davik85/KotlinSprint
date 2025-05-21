package org.example.Lesson10

const val STORED_LOGIN = "user123"
const val STORED_PASSWORD = "securePass456"

fun main() {
    print("Enter login: ")
    val inputLogin = readln()

    print("Enter password: ")
    val inputPassword = readln()

    val token = authorize(inputLogin, inputPassword)

    if (token != null) {
        println("Authorization successful. Token: $token\n")
        val cart = getCart(token)
        println("Your cart contains: ${cart.joinToString(", ")}")
    } else {
        println("Authorization failed. Invalid login or password.")
    }
}

fun authorize(login: String, password: String): String? {
    return if (login == STORED_LOGIN && password == STORED_PASSWORD) {
        generateToken()
    } else {
        null
    }
}

fun generateToken(): String {
    val chars = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    return List(32) { chars.random() }.joinToString("")
}

fun getCart(token: String): List<String> {
    return listOf("Laptop", "Smartphone", "Wireless Mouse", "Headphones")
}
