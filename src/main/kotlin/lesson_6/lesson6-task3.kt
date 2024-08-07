package org.example.lesson_6

fun main() {
    println("Введите время таймера: ")
    val time = readln().toInt()
    var timer = time

    while (timer > 0) {
        println("Прошло ${timer--} секунд")
        Thread.sleep(1000)
    }
    println("Прошло $time секунд")
}