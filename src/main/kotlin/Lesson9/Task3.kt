package org.example.Lesson9

const val EGGS_PER_PORTION = 2
const val MILK_PER_PORTION = 50 // ml
const val BUTTER_PER_PORTION = 15 // g

fun main() {
    print("Enter the number of portions: ")
    val portions = readln().toIntOrNull()

    if (portions == null || portions <= 0) {
        println("Invalid input. Please enter a positive number.")
        return
    }

    val totalEggs = EGGS_PER_PORTION * portions
    val totalMilk = MILK_PER_PORTION * portions
    val totalButter = BUTTER_PER_PORTION * portions

    println("For $portions portions you will need:")
    println("Eggs – $totalEggs")
    println("Milk – ${totalMilk}ml")
    println("Butter – ${totalButter}g")
}
