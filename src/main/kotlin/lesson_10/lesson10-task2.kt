package org.example.lesson_10

const val MIN_CREDENTIALS_LENGTH = 4

fun main() {
    println("Введите логин: ")
    val login = readln()
    println("Введите пароль: ")
    val password = readln()

    if (validation(login, password)) println("Добро пожаловать!")
    else println("Логин или пароль недостаточно длинные")
}

fun validation(login: String, password: String): Boolean =
    login.length > MIN_CREDENTIALS_LENGTH && password.length > MIN_CREDENTIALS_LENGTH