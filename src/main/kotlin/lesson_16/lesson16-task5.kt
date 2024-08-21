package org.example.lesson_16

class Player(val name: String, initialHealth: Int, val attackPower: Int) {
    var health: Int = initialHealth
        private set
    var attackStrength: Int = attackPower
        private set
    private var isAlive: Boolean = true

    fun takeDamage(damage: Int) {
        if (!isAlive) return

        health -= damage
        if (health <= 0) {
            health = 0
            die()
        }
    }

    fun heal(amount: Int) {
        if (!isAlive) {
            println("$name не может быть излечен, так как он мертв.")
            return
        }
        health += amount
    }

    private fun die() {
        println("$name умер.")
        health = 0
        attackStrength = 0
        isAlive = false
    }
}

fun main() {
    val player = Player(name = "Артас", initialHealth = 100, attackPower = 20)

    println("${player.name} вступает в бой с ${player.health} здоровьем и силой удара ${player.attackStrength}.")

    player.takeDamage(30)
    println("${player.name} получил урон. Осталось ${player.health} здоровья.")

    player.heal(10)
    println("${player.name} исцелился. Осталось ${player.health} здоровья.")

    player.takeDamage(50)
    println("${player.name} получил урон. Осталось ${player.health} здоровья.")

    player.heal(20)
    println("${player.name} исцелился. Осталось ${player.health} здоровья.")

    player.takeDamage(50)
    println("${player.name} получил урон. Осталось ${player.health} здоровья.")

    player.heal(50)
}
