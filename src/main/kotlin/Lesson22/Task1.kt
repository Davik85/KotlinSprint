package org.example.Lesson22

fun main() {
    val book1 = RegularBook("1984", "George Orwell")
    val book2 = RegularBook("1984", "George Orwell")

    val dataBook1 = DataBook("1984", "George Orwell")
    val dataBook2 = DataBook("1984", "George Orwell")

    println("Comparing regular class instances:")
    println(book1 == book2) // false, because RegularBook doesn't override equals()

    println("\nComparing data class instances:")
    println(dataBook1 == dataBook2) // true, because DataBook overrides equals() automatically
}

// Regular class: does not automatically implement equals(), hashCode(), or toString()
class RegularBook(val title: String, val author: String)

// Data class: automatically generates equals(), hashCode(), toString(), and copy()
data class DataBook(val title: String, val author: String)
