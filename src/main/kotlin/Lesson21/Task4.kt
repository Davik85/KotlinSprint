package org.example.Lesson21

import java.io.File

fun File.prependWord(word: String) {
    val lowercaseWord = word.lowercase()
    val existingContent = if (this.exists()) this.readText() else ""
    this.writeText("$lowercaseWord\n$existingContent")
}
