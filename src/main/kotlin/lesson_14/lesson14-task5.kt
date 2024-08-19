package org.example.lesson_14

open class Message(val id: Int, val message: String, val author: String)

class ChildMessage(
    id: Int,
    message: String,
    author: String,
    val parentMessageId: Int) : Message(id, message, author)

class Chat(
    private val messages: MutableList<Message> = mutableListOf<Message>(),
    private var messageId: Int = 1,
) {
    fun addMessage(message: String, author: String) {
        val message = Message(id = messageId++, message = message, author = author)
        messages.add(message)
    }

    fun addThreadMessage(parentMessageId: Int, message: String, author: String) {
        val parentMessage = messages.find { it.id == parentMessageId }

        if (parentMessage != null) {
            val childMessage = ChildMessage(
                id = messageId++,
                message = message,
                author = author,
                parentMessageId = parentMessageId)
            messages.add(childMessage)
        } else println("Ошибка: Сообщение с ID $parentMessageId не найдено.")
    }

    fun printChat() {
        val groupedMessages = messages.groupBy { (it as? ChildMessage)?.parentMessageId ?: it.id }

        groupedMessages.keys.sorted().forEach { parentId ->
            val parentMessage = messages.find { it.id == parentId }
            parentMessage?.let {
                printMessage(it)
                groupedMessages[parentId]?.filterIsInstance<ChildMessage>()?.forEach { childMessage ->
                    printMessage(childMessage, indentLevel = 1)
                }
            }
        }
    }

    private fun printMessage(message: Message, indentLevel: Int = 0) {
        val indent = "\t".repeat(indentLevel)
        println("$indent${message.author}: ${message.message}")
    }
}

fun main() {
    val chat = Chat()

    chat.addMessage("Привет", "A")
    chat.addMessage("Привет", "B")

    chat.addThreadMessage(1, "Привет, A", "C")
    chat.addThreadMessage(1, "Как твои дела?", "D")

    chat.addMessage("Прекрасно", "E")

    chat.printChat()
}