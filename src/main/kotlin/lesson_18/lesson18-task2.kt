package org.example.lesson_18

abstract class Dice (val sides: Int) {
    open fun roll() {
        println("Roll: ${(1..sides).random()}")
    }
}

class TetrahedralDice : Dice(4) {
    override fun roll() {
        println("D4 roll: ${(1..sides).random()}")
    }
}

class HexagonalDice : Dice(6) {
    override fun roll() {
        println("D6 roll: ${(1..sides).random()}")
    }
}

class OctagonalDice : Dice(8) {
    override fun roll() {
        println("D8 roll: ${(1..sides).random()}")
    }
}

fun main() {
    val dice4 = TetrahedralDice()
    val dice6 = HexagonalDice()
    val dice8 = OctagonalDice()

    val diceList: List<Dice> = listOf(dice4, dice6, dice8)

    for (dice in diceList) dice.roll()
}