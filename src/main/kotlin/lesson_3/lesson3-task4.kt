package org.example.lesson_3

fun main() {
    // Инициализация переменных для первого хода
    var from = "E2"
    var to = "E4"
    var moveNumber = 1

    // Формирование строки для отправки
    var moveString = "[$from-$to;$moveNumber]"
    println(moveString) // Вывод: [E2-E4;1]

    // Обновление переменных для следующего хода
    from = "D2"
    to = "D3"
    moveNumber = 2

    // Формирование строки для следующего хода
    moveString = "[$from-$to;$moveNumber]"
    println(moveString) // Вывод: [D2-D3;2]
}