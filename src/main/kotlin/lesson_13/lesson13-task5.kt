package org.example.lesson_13

class Contact4(
    val name: String,
    val phone: Long,
    val companyName: String? = null,
) {
    fun printContactInfo() {
        println("Имя: $name, Номер: $phone, Компания: ${companyName ?: "Не указано"}")
    }
}

fun main() {
    println("Введите номер телефона: ")
    val phoneNumber = readLine() ?: ""

    try {
        val phoneInput = phoneNumber.toLong()

        val contact = Contact4(name = "Иван Иванов", phone = phoneInput)

        contact.printContactInfo()

    } catch (e: NumberFormatException) {
        println("Ошибка: введенное значение не является корректным номером телефона.")
        println("Исключение: ${e::class.simpleName}")
    }
}