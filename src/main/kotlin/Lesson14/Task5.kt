package org.example.Lesson14

fun main() {
    val chat = Chat()

    chat.addMessage("Alice", "Hey, team! Ready for the meeting?")
    chat.addMessage("Bob", "Yes, just grabbing coffee.")

    chat.addThreadMessage(1, "Charlie", "Which meeting are you referring to?")
    chat.addThreadMessage(1, "Alice", "The sprint planning at 10.")

    chat.addMessage("Diana", "I'll join a bit later.")
    chat.addThreadMessage(2, "Bob", "Coffee acquired ☕")
    chat.addThreadMessage(3, "Eve", "Understood!")

    println("\n--- Chat log ---")
    chat.printChat()
}

open class Message(
    val id: Int,
    val author: String,
    val text: String
)

class ChildMessage(
    id: Int,
    author: String,
    text: String,
    val parentId: Int
) : Message(id, author, text)

class Chat {
    private val messages = mutableListOf<Message>()
    private var nextId = 1

    fun addMessage(author: String, text: String) {
        messages.add(Message(id = nextId++, author = author, text = text))
    }

    fun addThreadMessage(parentMessageId: Int, author: String, text: String) {
        val parentExists = messages.any { it.id == parentMessageId }
        if (!parentExists) {
            println("❌ Error: Parent message with ID $parentMessageId not found.")
            return
        }
        messages.add(ChildMessage(id = nextId++, author = author, text = text, parentId = parentMessageId))
    }

    fun printChat() {
        val groupedThreads = messages.filterIsInstance<ChildMessage>().groupBy { it.parentId }

        messages.filter { it !is ChildMessage }.forEach { message ->
            println("[${
                message.id
            }] ${message.author}: ${message.text}")

            groupedThreads[message.id]?.forEach { reply ->
                println("\t↳ [${reply.id}] ${reply.author}: ${reply.text}")
            }
        }
    }
}
