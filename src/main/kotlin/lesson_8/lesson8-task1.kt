package org.example.lesson_8

fun main() {
    val day1 = (1..1000).random()
    val day2 = (1..1000).random()
    val day3 = (1..1000).random()
    val day4 = (1..1000).random()
    val day5 = (1..1000).random()
    val day6 = (1..1000).random()
    val day7 = (1..1000).random()

    val views = arrayOf(day1, day2, day3, day4, day5, day6, day7)

    var totalViews = 0

    for (i in views) {
        totalViews += i
    }

    println(totalViews)
}