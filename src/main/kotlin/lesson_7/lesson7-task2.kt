package org.example.lesson_7

fun sendCode(): Int {
    val code = (1000..9999).random()
    println("Ваш код авторизации: $code")
    return code
}

fun main() {
    while (true) {
        val correctCode = sendCode()

        println("Пожалуйста, введите только что полученный код для авторизации: ")
        val userCode = readln().toInt()

        if (correctCode == userCode) {
            println("Авторизация успешна!")
            return
        } else {
            println("Код неверен, попробуйте ещё раз:")
        }
    }
}