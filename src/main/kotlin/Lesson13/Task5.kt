package org.example.Lesson13

fun main() {
    print("Enter name: ")
    val name = readln()

    print("Enter phone number: ")
    val input = readln()

    try {
        val phoneNumber = input.toLong()

        print("Enter company (optional): ")
        val companyInput = readln()
        val company = if (companyInput.isBlank()) null else companyInput

        val contact = SafeContact(name, phoneNumber, company)
        contact.printContactInfo()

    } catch (e: NumberFormatException) {
        println("An error occurred: ${e::class.simpleName}")
    }
}

class SafeContact(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {

    fun printContactInfo() {
        val companyDisplay = company ?: "<not specified>"
        println("Name: $name | Phone: $phoneNumber | Company: $companyDisplay")
    }
}
