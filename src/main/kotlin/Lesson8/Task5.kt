package org.example.Lesson8

fun main() {
    print("Enter the number of ingredients: ")
    val count = readln().toIntOrNull()

    if (count == null || count <= 0) {
        println("Invalid input. Please enter a positive number.")
        return
    }

    val ingredients = Array(count) { "" }

    for (i in ingredients.indices) {
        print("Enter ingredient #${i + 1}: ")
        ingredients[i] = readln()
    }

    println("You entered: ${ingredients.joinToString(", ")}")
}
