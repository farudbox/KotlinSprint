package org.example.lesson_20

fun main() {
    val elements = listOf('a', 'b', 'c', 'd', 'e')

    val lambdas = elements.map { element ->
        { println("Нажат эелемент: $element") }
    }

    for (index in lambdas.indices) {
        if ((index + 1) % 2 == 0) lambdas[index]()
    }
}