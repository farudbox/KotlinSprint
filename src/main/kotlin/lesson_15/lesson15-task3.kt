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

    abstract fun deleteMessage(messageId: Int)

    abstract fun deleteUser(user: Everyone)
}

class User (username: String) : Everyone(username) {
    override fun deleteUser(user: Everyone) {
        println("$username не имеет права на удаление пользователя")
    }

    override fun deleteMessage(messageId: Int) {
        println("$username не имеет права на удаление сообщений")
    }
}

class Admin (username: String) : Everyone(username) {
    override fun deleteUser(user: Everyone) {
        println("Пользователь $user был удален")
    }

    override fun deleteMessage(messageId: Int) {
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

    user1.deleteMessage(123)
    user1.deleteUser(user2)

    user2.deleteMessage(123)
    user2.deleteUser(user1)
}