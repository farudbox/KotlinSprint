package org.example.lesson_2

import kotlin.math.pow

/*
S = x * (1 + a) ^ n
S - сумма, образовавшаяся к концу срока;
x - начальная сумма вложенных средств
a - годовая процентная ставка
n - срок вклада в годах
 */

fun main() {
    val principal = 70_000f // x
    val annualRate = 0.167 // a
    val years = 20 // n

    val sum = principal * (1 + annualRate).pow(years) // Рассчитываем будущее значение вклада по формуле сложных процентов

    val formattedSum = String.format("%.3f", sum) // Форматируем результат с тремя знаками после запятой
    println("Размер вклада через $years лет составит: $formattedSum")
}

