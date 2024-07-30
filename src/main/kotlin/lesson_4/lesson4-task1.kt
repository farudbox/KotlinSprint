package org.example.lesson_4

const val TABLES = 13

fun main() {
    val bookedTablesToday = 13
    val bookedTablesTomorrow = 9 // 13-4 забронированных столика

    val availabilityToday = bookedTablesToday < TABLES
    val availabilityTomorrow = bookedTablesTomorrow < TABLES

    println("Доступность столиков на сегодня: $availabilityToday\nДоступность столиков на завтра: $availabilityTomorrow")
}