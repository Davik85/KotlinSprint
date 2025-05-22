package org.example.Lesson11

fun main() {
    val forum = Forum()

    val alice = forum.createNewUser("Alice")
    val bob = forum.createNewUser("Bob")

    forum.createNewMessage(alice.userId, "Hi everyone!")
    forum.createNewMessage(bob.userId, "Hello Alice!")
    forum.createNewMessage(alice.userId, "What do you think about TV series \"The Big Bang Theory\"?")
    forum.createNewMessage(bob.userId, "I love it! Very funny.")

    println("\nForum thread:")
    forum.printThread()
}

class ForumUser(
    val userId: Int,
    val userName: String
)

class ForumMessage(
    val authorId: Int,
    val message: String
)

class Forum {
    private val users = mutableListOf<ForumUser>()
    private val messages = mutableListOf<ForumMessage>()
    private var lastUserId = 0

    fun createNewUser(name: String): ForumUser {
        val user = ForumUser(++lastUserId, name)
        users.add(user)
        return user
    }

    fun createNewMessage(authorId: Int, message: String) {
        val userExists = users.any { it.userId == authorId }
        if (userExists) {
            messages.add(ForumMessage(authorId, message))
        } else {
            println("User with ID $authorId not found. Message not added.")
        }
    }

    fun printThread() {
        messages.forEach { msg ->
            val authorName = users.find { it.userId == msg.authorId }?.userName ?: "Unknown"
            println("$authorName: ${msg.message}")
        }
    }
}
