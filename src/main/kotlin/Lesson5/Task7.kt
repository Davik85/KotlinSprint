package org.example.Lesson5

const val KM_PER_100KM = 100.0

fun main() {
    print("Enter the distance of the trip (in kilometers): ")
    val distance = readln().toDoubleOrNull()

    print("Enter the fuel consumption per 100 km (in liters): ")
    val fuelConsumptionPer100Km = readln().toDoubleOrNull()

    print("Enter the current fuel price per liter: ")
    val fuelPricePerLiter = readln().toDoubleOrNull()

    if (distance == null || fuelConsumptionPer100Km == null || fuelPricePerLiter == null ||
        distance <= 0 || fuelConsumptionPer100Km <= 0 || fuelPricePerLiter <= 0
    ) {
        println("Invalid input. Please enter positive numbers only.")
        return
    }

    val fuelNeeded = (distance * fuelConsumptionPer100Km) / KM_PER_100KM
    val totalCost = fuelNeeded * fuelPricePerLiter

    println("Fuel needed: %.2f liters".format(fuelNeeded))
    println("Total cost of the trip: %.2f".format(totalCost))
}
