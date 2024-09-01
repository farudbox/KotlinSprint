package org.example.lesson_21

data class PlayerHeal(val name: String, var hp: Int, val maxHp: Int)

fun PlayerHeal.isHealthy(): Boolean {
    return this.hp == this.maxHp
}

fun main() {
    val player = PlayerHeal("John", 100, 100)
    println(player.isHealthy())

    val player2 = PlayerHeal("Jane", 50, 100)
    println(player2.isHealthy())
}
