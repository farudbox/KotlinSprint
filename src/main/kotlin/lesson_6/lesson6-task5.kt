package org.example.lesson_6

fun main() {
    println("Для прохождения регистрации введите логин и пароль")
    println("Логин: ")
    val login = readln()
    println("Пароль: ")
    val password = readln()

    if (authenticate(login, password)) {
        if (verifyAccess()) {
            println("Доступ разрешен!")
        } else println("Доступ запрещен!")
    }
}

fun authenticate(correctLogin: String, correctPassword: String): Boolean {
    println("Для авторизации введите ваш логин и пароль")

    while (true) {
        println("Введите логин: ")
        val inputLogin = readln()
        println("Введите пароль: ")
        val inputPassword = readln()

        if (inputLogin == correctLogin && inputPassword == correctPassword) {
            println("Авторизация прошла успешно")
            return true
        } else println("Неверные логин или пароль. Введите, пожалуйста, ваши данные заново")
    }
}

fun verifyAccess(): Boolean {
    var attemptsLeft = 3

    repeat(attemptsLeft) {
        val num1 = (1..9).random()
        val num2 = (1..9).random()
        val correctAnswer = num1 + num2

        println("Для авторизации вам надо решить простой пример: $num1 + $num2 = ?")
        val userAnswer = readln().toInt()

        if (userAnswer == correctAnswer) {
            return true
        } else {
            attemptsLeft--
            if (attemptsLeft > 0) {
                println("Неверно. Осталось попыток: $attemptsLeft")
            }
        }
    }

    return false
}