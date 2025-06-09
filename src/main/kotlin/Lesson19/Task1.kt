package org.example.Lesson19

fun main() {
    println("You can add the following fish to your aquarium:")
    FishType.entries.forEach { println("- ${it.displayName}") }
}

enum class FishType(val displayName: String) {
    GUPPY("Guppy"),
    ANGELFISH("Angelfish"),
    GOLDFISH("Goldfish"),
    SIAMESE_FIGHTING_FISH("Siamese Fighting Fish")
}
