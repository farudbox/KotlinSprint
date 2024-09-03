package org.example.lesson_22

data class BookForSell(val name: String, val author: String, val price: Int)

fun main() {
    val bookForSell = BookForSell("small red book", "mao", 40)

    val (name, author, price) = bookForSell

    println(name)
    println(author)
    println(price)
}