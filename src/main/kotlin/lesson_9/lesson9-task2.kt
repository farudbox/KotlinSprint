package org.example.lesson_9

fun main() {
    val ingredients = mutableListOf("яйцо", "зелень", "перец")
    println("В рецепте есть базовые ингредиенты: $ingredients")

    println("Желаете добавить еще?")
    val userAnswer = readln().lowercase()

    if (userAnswer == "да") {
        println("Какой ингредиент вы хотите добавить?")
        val newIngredient = readln()

        ingredients.add(newIngredient)
        println("Теперь в рецепте есть следующие ингредиенты: $ingredients")
    } else println("Программа завершена. В рецепте остались базовые ингредиенты.")
}