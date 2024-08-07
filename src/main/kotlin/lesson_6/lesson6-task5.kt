package org.example.lesson_6

fun main() {
    println("Пожалуйста, введите логин: ")
    val login = readln()
    println("Пожалуйста, введите пароль: ")
    val password = readln()

    var authenticated = false

    while (!authenticated) {
        println("Пожалуйста, введите логин: ")
        val inputLogin = readln()
        println("Пожалуйста, введите пароль: ")
        val inputPassword = readln()

        if (inputLogin == login && inputPassword == password) {
            println("Авторизация прошла успешно")
            authenticated = true

            var attemptsLeft = 3
            while (attemptsLeft > 0) {
                val num1 = (1..9).random()
                val num2 = (1..9).random()
                val correctAnswer = num1 + num2

                println("Решите простой пример: $num1 + $num2 = ?")
                val userAnswer = readln().toInt()

                if (userAnswer == correctAnswer) {
                    println("Добро пожаловать!")
                    return
                } else {
                    attemptsLeft--
                    if (attemptsLeft > 0) {
                        println("Неверно. Осталось попыток: $attemptsLeft")
                    } else {
                        println("Доступ запрещен")
                    }
                }
            }
        } else {
            println("Неверные логин или пароль. Введите, пожалуйста, ваши данные заново.")
        }
    }
}