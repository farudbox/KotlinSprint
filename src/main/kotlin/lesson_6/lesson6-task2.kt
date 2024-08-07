package org.example.lesson_6

fun main() {
    println("Введите время таймера: ")
    val time = readln().toInt()

    Thread.sleep(time * 1000L)

    println("Прошло $time секунд")
}