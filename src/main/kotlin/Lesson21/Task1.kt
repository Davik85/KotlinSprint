package org.example.Lesson21

fun main() {
    val word = "Hello"
    println("Vowel count in \"$word\": ${word.vowelCount()}")
}

fun String.vowelCount(): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    return this.count { it.lowercaseChar() in vowels }
}