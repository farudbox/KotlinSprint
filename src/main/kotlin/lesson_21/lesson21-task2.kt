package org.example.lesson_21

fun List<Int>.evenNumberSum(): Int {
    return this.filter { it % 2 == 0 }.sum()
}

fun main() {
    val listOfNumber = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(listOfNumber.evenNumberSum())
}