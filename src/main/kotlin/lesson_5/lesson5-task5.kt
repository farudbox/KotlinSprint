package org.example.lesson_5

fun main() {
    val randomNumbers = List(3) { (0..42).random() }
    val userNumbers = mutableListOf<Int>()

    println("Добро пожаловать в лотерею! Угадайте три числа от 0 до 42.")

    for (i in 1..3) {
        print("Введите число $i: ")
        val number = readln().toInt()
        userNumbers.add(number)
    }

    val matches = randomNumbers.intersect(userNumbers).size

    when (matches) {
        3 -> println("Поздравляем! Вы угадали все числа и выиграли джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали одно число и получаете утешительный приз!")
        else -> println("Вы не угадали ни одного числа. Неудача!")
    }

    println("Выигрышные числа: $randomNumbers")
}