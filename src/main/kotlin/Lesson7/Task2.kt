package org.example.Lesson7

import kotlin.random.Random

fun main() {
    println("Authorization by SMS code")

    var correctCode: Int

    do {
        correctCode = Random.nextInt(1000, 10000)
        println("Your authorization code: $correctCode")

        print("Enter the code: ")
        val inputCode = readln().toIntOrNull()

        if (inputCode == correctCode) {
            println("Welcome! Authorization successful.")
            break
        } else {
            println("Incorrect code. A new code will be sent.\n")
        }
    } while (true)
}