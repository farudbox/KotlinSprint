package org.example.lesson_6

fun main() {
    val numberToGuess = (1..9).random()
    var attemptsLeft = 5

    println("Угадайте число от 1 до 9. У вас есть 5 попыток.")

    while (attemptsLeft > 0) {
        println("Введите число: ")
        val userGuess = readln().toInt()

        if (userGuess == numberToGuess) {
            println("Это была великолепная игра!")
            return
        } else {
            attemptsLeft--
            if (attemptsLeft > 0) {
                println("Неверно. Осталось попыток: $attemptsLeft")
            } else {
                println("Неверно. Попытки закончились.")
            }
        }
    }

    println("Было загадано число $numberToGuess.")
}