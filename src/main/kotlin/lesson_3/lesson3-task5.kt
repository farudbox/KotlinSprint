package org.example.lesson_3

fun main() {

    val moveString = "D2-D4;0"

    val parts = moveString.split(";")
    val positions = parts[0].split("-")
    val moveNumber = parts[1]

    val from = positions[0]
    val to = positions[1]

    println("Откуда: $from")  // Вывод: Откуда: D2
    println("Куда: $to")      // Вывод: Куда: D4
    println("Номер хода: $moveNumber")  // Вывод: Номер хода: 0
}