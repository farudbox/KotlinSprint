package org.example.lesson_19

enum class Fishes(val type: String) {
    GUPPY("Guppy"),
    ANGELFISH("Angelfish"),
    GOLDFISH("Goldfish"),
    SIAMESE_FIGHTING_FISH("Siamese fighting fish")
}

fun main() {
    println("Вы можете добавить этих рыбок в своей аквариум: ")

    for (i in Fishes.entries) println(i.type)
}