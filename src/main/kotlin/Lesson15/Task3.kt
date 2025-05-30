package org.example.Lesson15

fun main() {
    val user = RegularUser("alice")
    val admin = AdminUser("moderator_bob")

    user.readForum()
    user.writeMessage("Hi everyone!")

    println()

    admin.readForum()
    admin.writeMessage("Please stay respectful in this thread.")
    admin.deleteMessage(42)
    admin.deleteUser(user)
}

abstract class ForumUser(
    val username: String
) {
    abstract fun readForum()
    abstract fun writeMessage(message: String)
}

class RegularUser(username: String) : ForumUser(username) {

    override fun readForum() {
        println("👤 $username is reading the forum.")
    }

    override fun writeMessage(message: String) {
        println("💬 $username wrote: \"$message\"")
    }
}

class AdminUser(username: String) : ForumUser(username) {

    override fun readForum() {
        println("🛡️ Admin $username is reviewing forum threads.")
    }

    override fun writeMessage(message: String) {
        println("💬 Admin $username posted: \"$message\"")
    }

    fun deleteMessage(messageId: Int) {
        println("🗑️ Admin $username deleted message with ID $messageId.")
    }

    fun deleteUser(user: ForumUser) {
        println("❌ Admin $username removed user: ${user.username}.")
    }
}
