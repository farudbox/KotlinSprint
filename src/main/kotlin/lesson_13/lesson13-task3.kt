package org.example.lesson_13

class Contact2(
    val name: String,
    val phone: Long,
    val companyName: String? = null,
) {
    fun printContactInfo() {
        println("Имя: $name, Номер: $phone, Компания: ${companyName ?: "Не указано"}")
    }
}

fun main() {
    val contact1 = listOf(
        Contact2(name = "a", phone = 89991119911, companyName = null),
        Contact2(name = "b", phone = 89992229922, companyName = null),
        Contact2(name = "c", phone = 89993339933, companyName = "null"),
        Contact2(name = "d", phone = 89994449944, companyName = "Компания"),
        Contact2(name = "e", phone = 89995559955, companyName = "Компания"),
    )

    contact1.mapNotNull { it.companyName }
        .filter { it != "null" }
        .forEach { println(it) }
}