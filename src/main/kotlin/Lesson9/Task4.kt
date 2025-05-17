package org.example.Lesson9

fun main() {
    print("Enter 5 ingredients separated by a comma and a space (e.g., sugar, milk, eggs, flour, butter): ")

    val ingredients = readln().split(", ")

    if (ingredients.size != 5) {
        println("Please enter exactly 5 ingredients.")
        return
    }

    val sortedIngredients = ingredients.sorted()

    println("Ingredients in alphabetical order: ${sortedIngredients.joinToString(", ")}")
}

