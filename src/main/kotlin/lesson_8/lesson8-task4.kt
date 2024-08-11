package org.example.lesson_8

fun main () {
    val ingredients = arrayOf("яйцо", "помидор", "зелень", "соль", "перец")

    println("Список ингридиентов: ")
    println(ingredients.joinToString(", "))

    println("Какой ингридиент вы хотите заменить?")
    val oldIngredient = readln()

    val index = ingredients.indexOfFirst { it.equals(oldIngredient, ignoreCase = true) }

    if (index != -1) {
        println("Введите новый ингредиент, на который вы хотите заменить $oldIngredient: ")
        val newIngredient = readln()

        ingredients[index] = newIngredient
        println("Готово! Вы сохранили следующий список: ")
        println(ingredients.joinToString(", "))
    } else println("Ингредиент $oldIngredient не найден в списке!")
}