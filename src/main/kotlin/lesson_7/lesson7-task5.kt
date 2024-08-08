package org.example.lesson_7

fun generatePassword(length: Int): String {
    val digits = "0123456789"
    val lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz"
    val upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val allCharacters = digits + lowerCaseLetters + upperCaseLetters

    require(length > 6) { "Минимальная длина пароля должна быть 6 символов" }

    val passwordBuilder = StringBuilder()

    passwordBuilder.append(digits.random())
    passwordBuilder.append(lowerCaseLetters.random())
    passwordBuilder.append(upperCaseLetters.random())

    for (i in 3 until length) {
        passwordBuilder.append(allCharacters.random())
    }
    return passwordBuilder.toList().shuffled().joinToString("")
}

fun main() {
    println("Введите длину пароля (минимум 6 символов): ")
    val length = readln().toInt()

    val password = generatePassword(length)
    println("Сгенерированный пароль: $password")
}

