package org.example.lesson_7

fun main() {
    println("Пожалуйста, введите число: ")
    val userNum = readln().toInt()

    for (i in 0..userNum) {
        println(i)
    }
}