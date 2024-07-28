package org.example.lesson_3

fun getUser(name: String, currentHour: Int) {
    val dayGreeting = "Добрый день"
    val eveningGreeting = "Добрый вечер"

    val greeting = if (currentHour in 0..17) {
        dayGreeting
    } else {
        eveningGreeting
    }

    println("$greeting, $name!")
}

fun main() {
    val userName = "Иван"
    var currentHour = 14

    getUser(userName, currentHour)

    currentHour = 18
    getUser(userName, currentHour)
}