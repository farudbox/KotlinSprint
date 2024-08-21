package org.example.lesson_14

open class Message(val id: Int, val message: String, val author: String)

class ChildMessage(
    id: Int,
    message: String,
    author: String,
    val parentMessageId: Int
) : Message(id, message, author)

class Chat {
    private val messages: MutableList<Message> = mutableListOf()
    private val childMessages: MutableList<ChildMessage> = mutableListOf()
    private var messageId: Int = 1

    fun addMessage(message: String, author: String) {
        val newMessage = Message(
            id = messageId++,
            message = message,
            author = author
        )
        messages.add(newMessage)
    }

    fun addThreadMessage(parentMessageId: Int, message: String, author: String) {
        val parentMessage = messages.find { it.id == parentMessageId }
        if (parentMessage != null) {
            val newChildMessage = ChildMessage(
                id = messageId++,
                message = message,
                author = author,
                parentMessageId = parentMessageId
            )
            childMessages.add(newChildMessage)
        } else {
            println("Ошибка: Сообщение с ID $parentMessageId не найдено.")
        }
    }

    fun printChat() {
        val groupedMessages = (messages + childMessages)
            .groupBy { (it as? ChildMessage)?.parentMessageId ?: it.id }

        groupedMessages.keys.sorted().forEach { parentId ->
            val parentMessage = messages.find { it.id == parentId }
            parentMessage?.let {
                printMessage(it)
                groupedMessages[parentId]
                    ?.filterIsInstance<ChildMessage>()
                    ?.forEach { childMessage -> printMessage(childMessage, indentLevel = 1) }
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

    chat.addMessage(message = "Привет", author = "A")
    chat.addMessage(message = "Привет", author = "B")
    chat.addThreadMessage(parentMessageId = 1, message = "Привет, A", author = "C")
    chat.addThreadMessage(parentMessageId = 1, message = "Как твои дела?", author = "D")
    chat.addMessage(message = "Прекрасно", author = "E")

    chat.printChat()
}
