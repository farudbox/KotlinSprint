package org.example.lesson_5

fun main() {
    val num1 = (0..42).random()
    val num2 = (0..42).random()

    println("$num1, $num2")

    println("Пожалуйста, введите первое число от 0 до 42: ")
    val userNum1 = readln().toInt()
    println("Пожалуйста, введите второе число от 0 до 42: ")
    val userNum2 = readln().toInt()

    val randomNumbers = listOf(num1, num2)
    val userNumbers = listOf(userNum1, userNum2)

    val matchNumbers = randomNumbers.intersect(userNumbers.toSet()).size

    when (matchNumbers) {
        2 -> println("Поздравляем! Вы выиграли главный приз!")
        1 -> println("Вы выиграли утешительный приз!")
    }

    println("Правильные числа: $num1 и $num2")
}