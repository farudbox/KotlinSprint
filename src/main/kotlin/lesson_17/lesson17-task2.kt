package org.example.lesson_17

class Ship(
    val name: String,
    var speed: Int,
    var homePort: String,
) {
    val shipName: String
        get() = name

    var shipNameSetter: String = name
        set(value) {
            println("Имя корабля $name не может быть изменено")
        }
}

fun main() {
    val ship = Ship(name = "Black Pearl", speed = 25, homePort = "Port Royal")

    println("Имя корабля: ${ship.shipName}")
    println("Средняя скорость: ${ship.speed} узлов")
    println("Порт приписки: ${ship.homePort}")

    ship.shipNameSetter = "Flying Dutchman"

    ship.speed = 30
    ship.homePort = "Tortuga"

    println("Имя корабля: ${ship.shipName}")
    println("Средняя скорость: ${ship.speed} узлов")
    println("Порт приписки: ${ship.homePort}")

}