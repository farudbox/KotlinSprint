package org.example.lesson_4

fun main() {
    val dayOfTraining = 5

    val isOddDay = dayOfTraining % 2 == 1

    println("Упражнения для рук: $isOddDay")
    println("Упражнения для ног: ${!isOddDay}")
    println("Упражнения для спины: ${!isOddDay}")
    println("Упражнения для пресса: $isOddDay")
}