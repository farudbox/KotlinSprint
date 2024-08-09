package org.example.lesson_7
/*
Функция была убрана для упрощения кода, но все ошибки были учтены
 */
fun main() {
    while (true) {
        val code = (1000..9999).random()
        println("Ваш код авторизации: $code")

        println("Пожалуйста, введите только что полученный код для авторизации: ")
        val userCode = readln().toInt()

        if (code == userCode) {
            println("Авторизация успешна!")
            return
        } else {
            println("Код неверен, попробуйте ещё раз:")
        }
    }
}