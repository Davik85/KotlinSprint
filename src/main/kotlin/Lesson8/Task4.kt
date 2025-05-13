package org.example.Lesson8

fun main() {
    val ingredients = arrayOf("flour", "sugar", "eggs", "milk", "butter")

    println("Current ingredients: ${ingredients.joinToString(", ")}")

    print("Enter the ingredient you want to replace: ")
    val toReplace = readln().lowercase()

    val index = ingredients.indexOfFirst { it.equals(toReplace, ignoreCase = true) }

    if (index == -1) {
        println("Ingredient \"$toReplace\" was not found in the list.")
    } else {
        print("Enter the new ingredient: ")
        val newIngredient = readln()

        ingredients[index] = newIngredient

        println("Done! Your updated ingredient list: ${ingredients.joinToString(", ")}")
    }
}
