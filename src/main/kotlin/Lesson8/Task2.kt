package org.example.Lesson8

fun main() {
    val ingredients = arrayOf("flour", "sugar", "eggs", "milk", "butter", "vanilla")

    print("Enter the ingredient you want to search for: ")
    val userInput = readln().lowercase()

    var found = false

    for (ingredient in ingredients) {
        if (ingredient.lowercase() == userInput) {
            found = true
            break
        }
    }

    if (found) {
        println("The ingredient \"$userInput\" is in the recipe.")
    } else {
        println("The ingredient \"$userInput\" is not in the recipe.")
    }
}
