package org.example.lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {
    println("Пожалуйста, введите ваш год рождения: ")
    val userYearOfBirth = readln().toInt()
    val currentYear = 2024

    if (currentYear - userYearOfBirth >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else println("Вернуться на главный экран приложения")
}
