package org.example.Lesson13

fun main() {
    val contacts = listOf(
        ContactEntry("Alice", 89001234567),
        ContactEntry("Bob", 89111234567, "Google"),
        ContactEntry("Carol", 89221234567, null),
        ContactEntry("Dave", 89331234567, "null"),
        ContactEntry("Eve", 89441234567, "Amazon")
    )

    val companies = contacts
        .mapNotNull { it.company }
        .filter { it.lowercase() != "null" }
        .toSet()

    println("Companies in the phonebook:")
    companies.forEach { println("- $it") }
}

class ContactEntry(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printContactInfo() {
        val companyDisplay = company ?: "<not specified>"
        println("Name: $name | Phone: $phoneNumber | Company: $companyDisplay")
    }
}
