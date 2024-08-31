package org.example.lesson_20

data class Player(val name: String, var hp: Int, val maxHp: Int)

fun main() {
    val healPotion: (Player) -> Unit = { player: Player ->
        player.hp = player.maxHp
        println("Пользователь ${player.name} восстановил здоровье. " +
                "Текущее здоровье: ${player.hp}")
    }

    val player = Player("Артас", 15, 20)

    healPotion(player)
}