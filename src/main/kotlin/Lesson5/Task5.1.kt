package org.example.Lesson5

const val CENTIMETERS_IN_METER = 100.0

fun main() {
    print("Please enter your weight in kilograms: ")
    val weight = readln().toDoubleOrNull()

    print("Please enter your height in centimeters: ")
    val heightCm = readln().toDoubleOrNull()

    if (weight == null || heightCm == null || weight <= 0 || heightCm <= 0) {
        println("Invalid input. Weight and height must be positive numbers.")
        return
    }

    val heightMeters = heightCm / CENTIMETERS_IN_METER
    val bmi = weight / (heightMeters * heightMeters)

    val category = when {
        bmi < 18.5 -> "Underweight"
        bmi < 25 -> "Normal weight"
        bmi < 30 -> "Overweight"
        else -> "Obesity"
    }

    println("Your BMI is %.2f".format(bmi))
    println("Weight category: $category")
}
