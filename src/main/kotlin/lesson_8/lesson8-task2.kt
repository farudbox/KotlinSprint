package org.example.lesson_8

fun main() {
    val ingredients = arrayOf("яйцо", "помидор", "зелень", "соль", "перец")

    println("Какой ингридиент вы желаете найти?")
    val userIngredient = readln()

    for (ingredient in ingredients) {
        if (ingredient.equals(userIngredient, ignoreCase = true)) {
            println("Ингредиент $userIngredient в рецепте есть.")
            return
        }
    }

    println("Такого ингредиента в рецепте нет.")
}
