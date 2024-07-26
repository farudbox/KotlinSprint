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
    val initialDepositAmount    = 70_000f    // x
    val interestRate            = 0.167      // a
    val depositTerm             = 20         // n

    val sum = initialDepositAmount * (1 + interestRate).pow(depositTerm)

    val formattedSum = String.format("%.3f", sum)

    println("Размер вклада через 20 лет составит: $formattedSum")
}