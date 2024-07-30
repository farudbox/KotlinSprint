package org.example.lesson_4

const val TABLES = 13

fun main() {
    val bookedTablesToday = 13
    val freeTablesTomorrow = 4
    val bookedTablesTomorrow = TABLES - freeTablesTomorrow // 9

    val availabilityToday = bookedTablesToday < TABLES
    val availabilityTomorrow = bookedTablesTomorrow < TABLES

    println("Доступность столиков на сегодня: $availabilityToday\nДоступность столиков на завтра: $availabilityTomorrow")
}