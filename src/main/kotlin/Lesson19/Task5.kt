package org.example.Lesson19

fun main() {
    println("Welcome to the Card Index System!")
    println("Please enter 5 people.")
    println("Input format: name gender")
    println("Available gender values: MALE or FEMALE\n")

    val people = mutableListOf<Person>()

    repeat(5) { index ->
        while (true) {
            print("Enter person ${index + 1}: ")
            val input = readln().trim().split(" ")

            if (input.size != 2) {
                println("Invalid format. Please enter: name gender")
                continue
            }

            val name = input[0]
            val gender = try {
                Gender.valueOf(input[1].uppercase())
            } catch (e: IllegalArgumentException) {
                println("Invalid gender. Please use MALE or FEMALE.")
                continue
            }

            people.add(Person(name, gender))
            break
        }
    }

    println("\nList of people in the card index:")
    people.forEach { println("- ${it.name}, gender: ${it.gender.displayName}") }
}

enum class Gender(val displayName: String) {
    MALE("Male"),
    FEMALE("Female")
}

class Person(val name: String, val gender: Gender)

