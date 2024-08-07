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
        } else println("Введите, пожалуйста, ваши даные, заново")
    }
}