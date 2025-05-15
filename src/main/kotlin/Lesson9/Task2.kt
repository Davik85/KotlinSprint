package org.example.Lesson9

fun main() {
    val ingredients = mutableListOf("flour", "sugar", "eggs")

    println("The recipe contains the following base ingredients: ${ingredients.joinToString(", ")}")

    print("Would you like to add another one? (yes/no): ")
    val response = readln()

    if (response.equals("yes", ignoreCase = true)) {
        print("What ingredient would you like to add? ")
        val newIngredient = readln()
        ingredients.add(newIngredient)
        println("Now the recipe contains the following ingredients: ${ingredients.joinToString(", ")}")
    } else {
        println("No ingredients were added. Goodbye!")
    }
}
