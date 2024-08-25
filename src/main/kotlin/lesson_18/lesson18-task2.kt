package org.example.lesson_18

abstract class Dice (val sides: Int) {
    abstract fun roll()
}

class D4 : Dice(4) {
    override fun roll() {
        val result = (1..sides).random()
        println("D4 rolled: $result")
    }
}

class D6 : Dice(6) {
    override fun roll() {
        val result = (1..sides).random()
        println("D6 rolled: $result")
    }
}

class D8 : Dice(8) {
    override fun roll() {
        val result = (1..sides).random()
        println("D8 rolled: $result")
    }
}

fun main() {
    val dice4 = D4()
    val dice6 = D6()
    val dice8 = D8()

    val diceList = listOf(dice4, dice6, dice8)

    for (dice in diceList) dice.roll()
}