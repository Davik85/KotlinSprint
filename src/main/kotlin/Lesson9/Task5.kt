package org.example.Lesson9

fun main() {
    val ingredients = mutableSetOf<String>()

    println("Please enter 5 ingredients (one by one):")

    while (ingredients.size < 5) {
        print("Enter ingredient #${ingredients.size + 1}: ")
        val input = readln().lowercase().trim()
        ingredients.add(input)
    }

    val sortedList = ingredients.toList().sorted()

    val result = sortedList.mapIndexed { index, ingredient ->
        if (index == 0) ingredient.replaceFirstChar { it.uppercase() } else ingredient
    }

    println("Ingredients: ${result.joinToString(", ")}")
}
