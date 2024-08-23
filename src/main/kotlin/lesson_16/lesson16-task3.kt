package org.example.lesson_16

class User(private val login: String, private val password: String) {

    fun validatePassword(inputPassword: String): Boolean {
        return inputPassword == password
    }
}

fun main() {
    val user = User("login", "12345")

    println("Пароль верен: ${user.validatePassword("12345")}")
}