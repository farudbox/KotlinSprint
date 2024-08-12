package org.example.lesson_8

fun main() {
    val ingredients = arrayOf("яйцо", "помидор", "зелень", "соль", "перец")

    println("Какой ингридиент вы желаете найти?")
    val userIngredient = readln()

    if (ingredients.any { it.equals(userIngredient, ignoreCase = true) }) {
        println("Ингредиент $userIngredient в рецепте есть.")
    } else {
        println("Такого ингредиента в рецепте нет.")
    }
}