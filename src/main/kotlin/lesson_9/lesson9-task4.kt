package org.example.lesson_9

fun main() {
    println("Введите 5 ингредиентов, разделенных запятой и пробелом (например: яйцо, молоко, соль, перец, масло):")
    val input = readln()

    val ingredients = input.split(", ").map { it.trim() }.toMutableList()

    if (ingredients.size == 5) {
        println("Вы ввели следующие ингредиенты: ")
        ingredients.forEach { println(it) }
    } else println("Ошибка: Вы должны ввести ровно 5 ингредиентов, разделенных запятой и пробелом.")
}