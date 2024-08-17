package org.example.lesson_11

class ForumMember(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,
)

class Forum {
    private val users = mutableListOf<ForumMember>()
    private val messages = mutableListOf<ForumMessage>()
    private var userIdCounter = 1

    fun createNewUser(userName: String): ForumMember {
        val newUser = ForumMember(userId = userIdCounter++, userName = userName)
        users.add(newUser)
        println("Новый пользователь ${newUser.userName} с ID ${newUser.userId} создан.")
        return newUser
    }

    fun createMessage(authorId: Int, message: String) {
        val user = users.find { it.userId == authorId }
        if (user != null) {
            val newMessage = ForumMessage(authorId = authorId, message = message)
            messages.add(newMessage)
            println("Сообщение от '${user.userName}': \"$message\" добавлено на форум.")
        } else println("Пользователь с ID $authorId не найден. Сообщение не добавлено.")
    }

    fun printThread() {
        messages.forEach { message ->
            val user = users.find { it.userId == message.authorId }
            println("${user?.userName}: ${message.message}")
        }
    }
}

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("user1")
    val user2 = forum.createNewUser("user2")

    forum.createMessage(user1.userId, "Hi")
    forum.createMessage(user2.userId, "Hi")
    forum.createMessage(user1.userId, "How are you?")
    forum.createMessage(user2.userId, "I'm doing great thx")

    println("\nТекущие сообщения на форуме:")
    forum.printThread()
}