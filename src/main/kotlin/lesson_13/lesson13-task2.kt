package org.example.lesson_13

class Contact1(
    val name: String,
    val phone: Long,
    val companyName: String? = null,
) {
    fun printContactInfo() {
        println("Имя: $name, Номер: $phone, Компания: ${companyName ?: "Не указано"}")
    }
}

fun main() {
    val contact = Contact1(
        name = "Ростислав",
        phone = 89123456789,
        companyName = "Reddit"
    )

    contact.printContactInfo()
}