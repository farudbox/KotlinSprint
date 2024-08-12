package org.example.lesson_9

fun main() {
    val ingredients = mutableListOf<String>()

    println("Введите 5 уникальных ингредиентов (по одному за раз): ")

    while (ingredients.size < 5) {
        val ingredient = readln().trim().lowercase()

        if (ingredient !in ingredients) {
            ingredients.add(ingredient)
        } else {
            println("Ингредиент '$ingredient' уже добавлен, введите другой: ")
        }
    }

    ingredients.sort()

    val capitalizedIngredients = ingredients.mapIndexed { index, s ->
        if (index == 0) s.replaceFirstChar { it.uppercaseChar() } else s
    }

    println(capitalizedIngredients.joinToString(", "))
}