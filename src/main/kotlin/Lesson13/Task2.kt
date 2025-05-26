package org.example.Lesson13

class PhonebookContact(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printContactInfo() {
        val companyDisplay = company ?: "<not specified>"
        println("Name: $name | Phone: $phoneNumber | Company: $companyDisplay")
    }
}
