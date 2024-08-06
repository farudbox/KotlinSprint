package org.example.lesson_5

fun main() {
    val num1 = (1..10).random()
    val num2 = (1..10).random()
    val result = num1 + num2

    println("Пожалуйста, решите этот пример: $num1 + $num2")
    val userResult = readln().toInt()

    println(if (userResult == result) "Верно!" else "Решение не верно.")
}