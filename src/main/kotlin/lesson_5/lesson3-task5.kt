package org.example.lesson_5

fun main() {
    val num1 = (0..42).random()
    val num2 = (0..42).random()

    println("Пожалуйста, введите первое число от 0 до 42: ")
    val userNum1 = readln().toInt()
    println("Пожалуйста, введите второе число от 0 до 42: ")
    val userNum2 = readln().toInt()

    val matched1 = num1 == userNum1 || num1 == userNum2
    val matched2 = num2 == userNum1 || num2 == userNum2

    when {
        matched1 && matched2 -> println("Поздравляем! Вы выиграли главный приз!")
        matched1 || matched2 -> println("Вы выиграли утешительный приз!")
        else -> println("Неудача!")
    }

    println("Правильные числа: $num1 и $num2")
}