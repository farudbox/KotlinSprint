package org.example.lesson_9

fun main() {
    val ingredients = mutableSetOf<String>()

    println("Введите 5 уникальных ингредиентов (по одному за раз): ")

    while (ingredients.size < 5) {
        val inputIngredient = readln().trim().lowercase()

        if (inputIngredient !in ingredients) {
            ingredients.add(inputIngredient)
        } else {
            println("Ингредиент '$inputIngredient' уже добавлен, введите другой: ")
        }
    }

    ingredients.sorted()

    val capitalizedIngredients = ingredients.mapIndexed { index, s ->
        if (index == 0) s.replaceFirstChar { it.uppercaseChar() } else s
    }

    println(capitalizedIngredients.joinToString(", "))
}