package org.example.Lesson21

fun main() {
    val skills = mapOf(
        "Archery" to 120,
        "Magic" to 200,
        "Stealth" to 150
    )

    val topSkill = skills.maxCategory()
    println("Top skill: $topSkill")
}

fun Map<String, Int>.maxCategory(): String? {
    return this.maxByOrNull { it.value }?.key
}
