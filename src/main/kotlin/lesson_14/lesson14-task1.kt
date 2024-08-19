package org.example.lesson_14

open class Liner(
    open val speed: Int = 30,
    open val capacity: Int = 3000,
) {
    open fun description() {
        println("Грузовой корабль со скоростью $speed узлов и вместимостью в $capacity пассажиров.")
    }
}

class CargoShip (
    override val speed: Int = 20,
    private val cargoCapacity: Int = 2000,
) : Liner(speed = speed, capacity = 0) {

    override fun description() {
        println("Это грузовой корабль со скоростью $speed узлов и грузоподъемностью $cargoCapacity тонн.")
    }
}

class Icebreaker (
    override val speed: Int = 10,
    override val capacity: Int = 1000,
) : Liner(speed = speed, capacity = capacity) {

    fun breakIce() {
        println("Ледокол колет лед на своем пути.")
    }

    override fun description() {
        println("Это ледокол со скоростью $speed узлов и вместимостью $capacity пассажиров.")
    }
}

fun main() {
    val liner = Liner()
    val cargoShip = CargoShip()
    val icebreaker = Icebreaker()

    liner.description()
    cargoShip.description()
    icebreaker.description()

    icebreaker.breakIce()
}