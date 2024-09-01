package org.example.lesson_19

enum class Gender {
    MALE, FEMALE;

    companion object {
        fun fromString(value: String): Gender? {
            return when (value.toLowerCase()) {
                "male" -> MALE
                "female" -> FEMALE
                else -> null
            }
        }
    }
}

data class Person(val name: String, val gender: Gender)

fun main() {
    val people = mutableListOf<Person>()

    println("Добро пожаловать в приложение 'Картотека'.")
    println("Введите информацию о человеке в формате: имя пол")
    println("Пол может принимать значения: male или female.")
    println("Введите данные для 5 человек:")

    while (people.size < 5) {
        println("Введите имя и пол через пробел: ")
        val input = readln()

        if ((input != null) && input.isNotBlank()) {
            val parts = input.split(" ")

            if (parts.size == 2) {
                val name = parts[0]
                val genderInput = parts[1]
                val gender = Gender.fromString(genderInput)
                if (gender != null) {
                    people.add(Person(name, gender))
                    println("Добавлен: $name, ${gender.name.toLowerCase()}")
                } else {
                    println("Ошибка: Неверный формат пола. Пожалуйста, используйте 'male' или 'female'.")
                }
            } else {
                println("Ошибка: Введите данные в правильном формате (например, 'Иван male').")
            }
        } else {
            println("Ошибка: Введите непустую строку.")
        }
    }
    println("\nСписок людей в картотеке:")
    people.forEach { person ->
        println("${person.name}, пол: ${person.gender.name.toLowerCase()}")
    }
}