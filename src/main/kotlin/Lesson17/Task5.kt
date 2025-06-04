package org.example.Lesson17

fun main() {
    val user = User("admin", "securePass123")

    println("Password: ${user.password}")

    user.password = "newPass456"

    user.login = "superadmin"
}

class User(login: String, password: String) {

    var login: String = login
        set(value) {
            field = value
            println("Login changed successfully.")
        }

    var password: String = password
        get() = "*".repeat(field.length)
        set(value) {
            println("You cannot change the password.")
        }
}
