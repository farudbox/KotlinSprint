package org.example.lesson_20

data class PlayerKey(val name: String, val hasKey: Boolean)

fun main() {
    val openDoor: (PlayerKey) -> Unit = { player: PlayerKey ->
        if (player.hasKey) println("Door opened") else println("Door is not opened. You need to find a key.")
    }

    val playerWithKey = PlayerKey("Артас", true)

    openDoor(playerWithKey)
}