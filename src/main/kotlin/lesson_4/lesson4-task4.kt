package org.example.lesson_4

fun main() {
    val dayOfTraining = 5

    // IDE предупреждает меня об избыточных условиях, но я не особо понимаю как их решить
    val arms = dayOfTraining % 2 == 1
    val legs = dayOfTraining % 2 == 0
    val back = dayOfTraining % 2 == 0
    val press = dayOfTraining % 2 == 1

    println("Упражнения для рук: $arms")
    println("Упражнения для ног: $legs")
    println("Упражнения для спины: $back")
    println("Упражнения для пресса: $press")
}