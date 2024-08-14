package org.example.lesson_10

fun main() {
    var userWins = 0

    println("Добро пожаловать в игру! Напишите \"начать\", чтобы бросить кости")
    val agree: Boolean = readln().lowercase() == "начать"

    if (agree) {
        do {
            val result = playRound()

            if (result > 0) {
                userWins++
            }

            println("Хотите бросить кости еще раз? Введите Да или Нет")
            val playAgain = readln().lowercase()

            if (playAgain != "да") {
                println("Спасибо за игру! Вы выиграли $userWins партий.")
                break
            }
        } while (true)
    } else {
        println("Игра завершена.")
    }
}

fun playRound(): Int {
    println("Вы сделали бросок!")
    val userThrow: Int = throwTheDice()
    println("Вам выпало $userThrow")

    println("Ход противника!")
    val compThrow: Int = throwTheDice()
    println("Противнику выпало $compThrow")

    return when {
        userThrow > compThrow -> {
            println("Победило человечество")
            1
        }
        userThrow < compThrow -> {
            println("Победила машина")
            -1
        }
        else -> {
            println("Ничья!")
            0
        }
    }
}

fun throwTheDice(): Int {
    return (1..6).random()
}