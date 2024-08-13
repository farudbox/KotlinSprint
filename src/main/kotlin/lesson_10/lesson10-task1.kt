package org.example.lesson_10

fun main() {
    println("Добро пожаловать в игру! Напишите \"начать\" чтобы бросить кости")
    val agree = readln().lowercase() == "начать"

    while (agree) {
        println("Вы сделали бросок!")
        val userThrow = throwTheDice()
        println("Вам выпало $userThrow")
        println("Ход противника!")
        val compThrow = throwTheDice()
        println("Противнику выпало $compThrow")

        if (userThrow > compThrow) { //
            println("Победило человечество")
            return
        } else {
            println("Победила машина")
            return
        }
    }
}

fun throwTheDice(): Int = (1..6).random()