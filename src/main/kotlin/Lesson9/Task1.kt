package org.example.Lesson9

fun main() {
    val ingredients = listOf("flour", "sugar", "eggs", "milk", "butter")

    println("The recipe contains the following ingredients: ${ingredients.joinToString(", ")}")

    println("\nIngredients list:")
    for (ingredient in ingredients) {
        println("- $ingredient")
    }
}
