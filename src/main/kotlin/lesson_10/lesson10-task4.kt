package org.example.lesson_10

fun throwTheDice(): Int {
    return (1..6).random()
}

fun playRound() {
    println("Вы сделали бросок!")
    val userThrow = throwTheDice()
    println("Вам выпало $userThrow")

    println("Ход противника!")
    val compThrow = throwTheDice()
    println("Противнику выпало $compThrow")

    if (userThrow > compThrow) { //
        println("Победило человечество")
    } else if (userThrow < compThrow) {
        println("Победила машина")
    } else println("Ничья")
}

fun main() {
    println("Добро пожаловать в игру! Напишите \"начать\" чтобы бросить кости")
    val agree = readln().lowercase() == "начать"

    while (agree) {
        playRound()
        println("Хотите бросить кости снова? (да/нет)")
        val playAgain = readln().lowercase()

        if (playAgain != "да") {
            println("Спасибо за игру! До встречи!")
            return
        }
    }
}