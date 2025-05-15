package org.example.Lesson9

fun main() {
    val baseIngredients = listOf(2, 50, 15)

    print("Enter the number of portions: ")
    val portions = readln().toIntOrNull()

    if (portions == null || portions <= 0) {
        println("Invalid input. Please enter a positive number.")
        return
    }

    val requiredIngredients = baseIngredients.map { it * portions }

    println("For $portions portions you will need:")
    println("Eggs – ${requiredIngredients[0]}")
    println("Milk – ${requiredIngredients[1]} ml")
    println("Butter – ${requiredIngredients[2]} g")
}

