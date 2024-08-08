package org.example.lesson_7

fun generatePassword (length: Int): String {
    val digits = "0123456789"
    val letters = "abcdefghijklmnopqrstuvwxyz"
    val passwordBuilder = StringBuilder()

    for (i in 0 until length) {
        if (i % 2 == 0) {
            passwordBuilder.append(letters.random())
        } else passwordBuilder.append(digits.random())
    }

    return passwordBuilder.toString()
}

fun main() {
    val passwordLength = 6
    val generatedPassword = generatePassword(passwordLength)

    println(generatedPassword)
}