package org.example.lesson_10

fun main() {
    println("Какой длины пароль вы желаете?")
    val num = readln().toInt()

    println("Ваш пароль: ${generatePassword(num)}")
}

fun generatePassword(num: Int): String {
    val numbers = '0'..'9'
    val chars = "!\"#\$%&'()*+,-./ "
    var password = ""

    for (i in 0 until num) password += if (i % 2 == 0) numbers.random() else chars.random()
    return password
}