package org.example.Lesson13

fun main() {
    val phonebook = mutableListOf<DirectoryContact>()

    println("Enter contacts for the phone directory.")
    println("To stop, just press Enter when asked for a name.\n")

    while (true) {
        print("Enter name: ")
        val name = readln()
        if (name.isBlank()) break

        print("Enter phone number: ")
        val phoneInput = readln()
        val phone = phoneInput.toLongOrNull()
        if (phone == null) {
            println("Invalid phone number. Contact was not added.\n")
            continue
        }

        print("Enter company (optional): ")
        val companyInput = readln()
        val company = if (companyInput.isBlank()) null else companyInput

        phonebook.add(DirectoryContact(name, phone, company))
        println("Contact added.\n")
    }

    println("\nPhonebook:")
    phonebook.forEach { it.printContactInfo() }
}

class DirectoryContact(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printContactInfo() {
        val companyDisplay = company ?: "<not specified>"
        println("Name: $name | Phone: $phoneNumber | Company: $companyDisplay")
    }
}
