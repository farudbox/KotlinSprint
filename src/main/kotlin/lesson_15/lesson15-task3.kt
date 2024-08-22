package org.example.lesson_15

abstract class Everyone(
    val username: String
) {
    open fun readMessage() {
        println("$username сейчас читает форум")
    }

    open fun sendMessage(message: String) {
        println("$username отправил сообщение \"$message\"")
    }
}

class User (username: String) : Everyone(username)

class Admin (username: String) : Everyone(username) {
    fun deleteUser(user: Everyone) {
        println("Пользователь $user был удален")
    }

    fun deleteMessage(messageId: Int) {
        println("Сообщение $messageId было удалено")
    }
}

fun main() {
    val user1 = User("Alice")
    val user2 = Admin("Bob")

    user1.sendMessage("Привет")
    user2.readMessage()

    user2.sendMessage("Привет")
    user1.readMessage()

    user2.deleteMessage(123)
    user2.deleteUser(user1)
}