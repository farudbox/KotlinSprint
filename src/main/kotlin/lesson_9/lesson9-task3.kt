package org.example.lesson_9

fun main() {
    val ingredients = mutableListOf(2, 50, 15)
    val userNum = readln().toInt()

    ingredients.map { println(it * userNum) }

    println(
        "На $userNum порций омлета вам понадобится: Яиц – ${ingredients[0]} шт., " +
                "молока – ${ingredients[1]} мл, " +
                "сливочного масла – ${ingredients[2]} гр"
    )
}