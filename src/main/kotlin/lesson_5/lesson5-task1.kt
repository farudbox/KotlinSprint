package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val num1 = Random.nextInt(1, 10)
    val num2 = Random.nextInt(1, 10)
    val result = num1 + num2

    println("Пожалуйста, решите этот пример: $num1 + $num2")
    val userResult = readln().toInt()

    println(if (userResult == result) "Верно!" else "Решение не верно.")
}