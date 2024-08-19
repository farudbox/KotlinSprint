package org.example.lesson_13

class Contact3(
    val name: String,
    val phone: Long,
    val companyName: String? = null,
) {
    fun printContactInfo() {
        println("Имя: $name, Номер: $phone, Компания: ${companyName ?: "Не указано"}")
    }
}

fun main() {
    val contact3 = mutableListOf<Contact3>()

    val inputs = listOf(
        Triple("a", "89991119911", null),
        Triple("b", "", null),
        Triple("c", "invalid_number", "null"),
        Triple("d", "89994449944", ""),
        Triple("e", "89995559955", "Компания")
    )

    for ((name, phone, company) in inputs) {
        val phoneNumber = phone.toLongOrNull()
        if (phoneNumber != null) {
            val contact = Contact3(name = name, phone = phoneNumber, companyName = company ?: null)
            contact3.add(contact)
        } else {
            println("Ошибка: некорректный номер телефона для контакта '$name'. Контакт не добавлен.")
        }
    }

    println("\nКонтакты в телефонной книге:")
    contact3.forEach { it.printContactInfo() }
}