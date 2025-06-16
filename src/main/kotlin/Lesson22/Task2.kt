package org.example.Lesson22

fun main() {
    val simpleBook = SimpleBook("1984", "George Orwell")
    val structuredBook = StructuredBook("1984", "George Orwell")

    println("SimpleBook object:")
    println(simpleBook) // Prints default toString(): class name + hashcode

    println("\nStructuredBook object:")
    println(structuredBook) // Prints property values thanks to data class
}

// Regular class without overridden toString()
class SimpleBook(val title: String, val author: String)

// Data class automatically provides a readable toString() implementation
data class StructuredBook(val title: String, val author: String)
