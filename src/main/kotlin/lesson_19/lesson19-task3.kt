package org.example.lesson_19

class SpaceShip(val name: String) {
    fun takeoff() {
        println("Корабль взлетает")
    }

    fun landing() {
        // TODO: Implement takeOff logic
        println("Корабль производит посадку")
    }

    fun shootAsteroid() {
        throw NotImplementedError("Метод shootAsteroid еще не реализован.")
    }
}

fun main() {
    val ship1 = SpaceShip("Корабль 1")

    ship1.takeoff()
    ship1.landing()
    ship1.shootAsteroid()
}