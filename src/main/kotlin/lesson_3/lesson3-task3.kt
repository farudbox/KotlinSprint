package org.example.lesson_3

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Пожалуйста, введите число:")
    val num = scanner.nextInt()

    if (num in 1..10) {
        for (i in 1..10) {
            println("$num * $i = ${num * i}")
        }
    } else println("Число не распознано")
}