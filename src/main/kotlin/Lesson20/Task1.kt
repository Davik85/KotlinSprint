package org.example.Lesson20

fun main() {
    val greetUser: (String) -> String = { username ->
        "Happy New Year, $username!"
    }

    val name = "Alex"
    println(greetUser(name))
}

