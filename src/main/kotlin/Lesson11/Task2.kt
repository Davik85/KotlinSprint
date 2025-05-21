package org.example.Lesson11

class User2(
    val id: Int,
    val login: String,
    private var password: String,
    val email: String,
    var bio: String = ""
) {
    fun printInfo() {
        println("ID: $id")
        println("Login: $login")
        println("Email: $email")
        println("Bio: ${if (bio.isNotEmpty()) bio else "No bio provided."}")
        println()
    }

    fun inputBio() {
        print("Enter your bio: ")
        bio = readln()
    }

    fun changePassword() {
        print("Enter current password: ")
        val current = readln()
        if (current == password) {
            print("Enter new password: ")
            password = readln()
            println("Password changed successfully.\n")
        } else {
            println("Incorrect current password. Password not changed.\n")
        }
    }
}

fun main() {
    val user = User2(1, "demoUser", "initialPass", "demo@example.com")

    user.inputBio()

    user.changePassword()

    println("Updated user info:")
    user.printInfo()
}
