package org.example.lesson_8

fun main() {
    println("Сколько ингредиентов вы хотите добавить?")
    val count = readln().toInt()

    val ingredients = Array(count) { "" }

    for (i in ingredients.indices) {
        println("Введите ингредиент, который хотите добавить: ")
        ingredients[i] = readln()
    }

    println("Вы ввели следующие ингредиенты: ${ingredients.joinToString(", ")}")
}