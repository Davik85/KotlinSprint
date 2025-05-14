package org.example.Lesson8

fun main() {
    val ingredients = arrayOf("flour", "sugar", "eggs", "milk", "butter", "vanilla")

    print("Enter the ingredient you want to search for: ")
    val userInput = readln().lowercase()

    val isPresent = ingredients.any { it.equals(userInput, ignoreCase = true) }

    if (isPresent) {
        println("The ingredient \"$userInput\" is in the recipe.")
    } else {
        println("The ingredient \"$userInput\" is not in the recipe.")
    }
}
