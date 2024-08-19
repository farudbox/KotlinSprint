package org.example.lesson_14

open class Liner1(
    open val speed: Int = 30,
    open val capacity: Int = 3000,
) {
    open fun description() {
        println("Это лайнер со скоростью $speed узлов и вместимостью в $capacity пассажиров.")
    }

    open fun loadingMethod() {
        println("Лайнер выдвигает горизонтальный трап со шкафута")
    }
}

class CargoShip1 (
    override val speed: Int = 20,
    private val cargoCapacity: Int = 2000,
) : Liner1(speed = speed, capacity = 0) {

    override fun description() {
        println("Это грузовой корабль со скоростью $speed узлов и грузоподъемностью $cargoCapacity тонн.")
    }

    override fun loadingMethod() {
        println("грузовой корабль активирует погрузочный кран")
    }
}

class Icebreaker1 (
    override val speed: Int = 10,
    override val capacity: Int = 1000,
) : Liner1(speed = speed, capacity = capacity) {

    fun breakIce() {
        println("Ледокол колет лед на своем пути.")
    }

    override fun description() {
        println("Это ледокол со скоростью $speed узлов и вместимостью $capacity пассажиров.")
    }

    override fun loadingMethod() {
        println("Ледокол открывает ворота со стороны кормы")
    }
}

fun main() {
    val liner = Liner1()
    val cargoShip = CargoShip1()
    val icebreaker = Icebreaker1()

    liner.description()
    liner.loadingMethod()

    cargoShip.description()
    cargoShip.loadingMethod()

    icebreaker.description()
    icebreaker.loadingMethod()

    icebreaker.breakIce()
}