package org.example.Lesson7

fun main() {
    print("Enter a number: ")
    val upperLimit = readln().toIntOrNull()

    if (upperLimit == null || upperLimit < 0) {
        println("Invalid input. Please enter a non-negative number.")
        return
    }

    println("Even numbers from 0 to $upperLimit:")
    for (i in 0..upperLimit step 2) {
        println(i)
    }
}
