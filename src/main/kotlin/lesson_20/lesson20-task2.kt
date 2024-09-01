package org.example.lesson_20

data class PlayerHeal(val name: String, var hp: Int, val maxHp: Int)

fun main() {
    val healPotion: (PlayerHeal) -> Unit = { player: PlayerHeal ->
        player.hp = player.maxHp
        println("Пользователь ${player.name} восстановил здоровье. " +
                "Текущее здоровье: ${player.hp}")
    }

    val player = PlayerHeal("Артас", 15, 20)

    healPotion(player)
}