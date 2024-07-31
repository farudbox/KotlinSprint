package org.example.lesson_3

fun main() {
    var from = "E2"
    var to = "E4"
    var moveNumber = 1

    var moveString = "[$from-$to;$moveNumber]"
    println(moveString)

    from = "D2"
    to = "D3"
    moveNumber = 2

    moveString = "[$from-$to;$moveNumber]"
    println(moveString)
}