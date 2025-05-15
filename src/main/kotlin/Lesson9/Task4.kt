package org.example.Lesson9

fun main() {
    print("Enter 5 ingredients separated by a comma and a space (e.g., sugar, milk, eggs, flour, butter): ")
    val input = readln()

    val ingredients = input.split(", ")

    if (ingredients.size != 5) {
        println("Please enter exactly 5 ingredients separated by \", \".")
        return
    }

    val sortedIngredients = ingredients.sorted()

    println("Ingredients in alphabetical order:")
    println(sortedIngredients.joinToString(", "))
}
