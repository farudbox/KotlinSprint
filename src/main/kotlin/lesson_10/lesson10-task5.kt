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

    val retrievedCart = getCart(token)

    if (retrievedCart != null) {
        println("Содержимое корзины: $retrievedCart")
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
    val tokenLength = 32
    val numbers = '0'..'9'
    val lowerCaseLetters = 'a'..'z'
    val upperCaseLetters = 'A'..'Z'
    return List(tokenLength) {
        numbers.random()
        lowerCaseLetters.random()
        upperCaseLetters.random()
    }.joinToString("")
}

fun getCart(token: String?): List<String>? {
    return if (token != null) {
        cart
    } else {
        null
    }
}