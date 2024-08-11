package org.example.lesson_7

fun main() {
    println("Пожалуйста, введите время: ")
    val time = readln().toInt()

    for (i in time downTo 1) {
        println("Осталось $i секунд")
        Thread.sleep(1000)
    }
    println("Время вышло")
}