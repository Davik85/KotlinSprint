package org.example.Lesson20

fun main() {
    val items = listOf("Home", "Settings", "Profile", "Messages", "Logout")

    val clickActions: List<() -> Unit> = items.map { item ->
        { println("Element clicked: $item") }
    }

    for (i in clickActions.indices step 2) {
        clickActions[i]()
    }
}
