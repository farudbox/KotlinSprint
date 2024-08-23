package org.example.lesson_16

class Player(val name: String, initialHealth: Int, attackPower: Int) {

    var health: Int = initialHealth
        private set
    var attackStrength: Int = attackPower
        private set

    private var isAlive: Boolean = true

    fun startBattle() {
        println("${name} вступает в бой с ${health} здоровьем и силой удара ${attackStrength}.")
    }

    fun takeDamage(damage: Int) {
        if (!isAlive) {
            println("$name уже мертв и не может получать урон.")
            return
        }

        health -= damage
        if (health <= 0) {
            health = 0
            die()
        } else {
            println("${name} получил урон. Осталось ${health} здоровья.")
        }
    }

    fun heal(amount: Int) {
        if (!isAlive) {
            println("$name не может быть излечен, так как он мертв.")
            return
        }

        health += amount
        println("${name} исцелился. Осталось ${health} здоровья.")
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

    player.startBattle()
    player.takeDamage(damage = 30)
    player.heal(amount = 10)
    player.takeDamage(damage = 50)
    player.takeDamage(damage = 20)
    player.heal(amount = 50)
}
