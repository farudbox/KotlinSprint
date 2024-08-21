package org.example.lesson_14

open class Liner(
    val name: String,
    open val speed: Int = 30,
    open val capacity: Int = 3000,
    open val cargoCapacity: Int = 0,
) {
    open fun description() {
        println("Лайнер $name со скоростью $speed узлов и вместимостью в $capacity пассажиров.")
    }
}

class CargoShip (
    name: String,
    speed: Int = 20,
    cargoCapacity: Int = 2000,
) : Liner(name, speed, cargoCapacity) {

    override fun description() {
        println("Это грузовой корабль $name со скоростью $speed узлов и грузоподъемностью $cargoCapacity тонн.")
    }
}

class Icebreaker (
    name: String,
    speed: Int = 10,
    capacity: Int = 1000,
) : Liner(name, speed, capacity) {

    fun breakIce() {
        println("Ледокол колет лед на своем пути.")
    }

    override fun description() {
        println("Это ледокол $name со скоростью $speed узлов и вместимостью $capacity пассажиров.")
    }
}

fun main() {
    val liner = Liner("Titanic")
    val cargoShip = CargoShip("Alice")
    val icebreaker = Icebreaker("North")

    liner.description()
    cargoShip.description()
    icebreaker.description()

    icebreaker.breakIce()
}