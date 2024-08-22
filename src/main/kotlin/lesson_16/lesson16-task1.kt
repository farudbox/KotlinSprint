package org.example.lesson_16

class Dice {
    private val fieldNum: Int = (0..6).random()

    fun showDiceField() {
        println("Выпавшее число: $fieldNum")
    }
}

fun main() {
    val dice = Dice()
    dice.showDiceField()
}

