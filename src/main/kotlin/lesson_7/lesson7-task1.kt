package org.example.lesson_7

fun main() {
    val passwordLength = 6
    val digits = 1..9
    val letters = 'a'..'z'
    var password = ""

    for (i in 0 until passwordLength) {
       password += if (i % 2 == 0) letters.random() else digits.random()
    }

    println(password)
}