package org.example.lesson_10

const val LOGIN = "login"
const val PASSWORD = "password"
val cart = listOf("элемент1", "элемент2", "элемент3")

fun main() {
    println("Введите логин: ")
    val userLogin = readln()
    println("Введите пароль: ")
    val userPassword = readln()

    val token = authorize(userLogin, userPassword)

    if (token != null) {
        println("Содержимое корзины: ${getCart()}")
    } else {
        println("Неудачная авторизация. Доступ к корзине невозможен.")
    }
}

fun authorize(login: String, password: String): String? {
    return if (login == LOGIN && password == PASSWORD) {
        generateToken()
    } else {
        null
    }
}

fun generateToken(): String {
    val allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
    return (1..32).map { allowedChars.random() }.joinToString("")
}

fun getCart(): String {
    return cart.joinToString()
}