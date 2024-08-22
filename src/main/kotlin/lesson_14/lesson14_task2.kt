package org.example.lesson_14

open class Liner1(
    val name: String,
    open val speed: Int = 30,
    open val capacity: Int = 3000,
    open val cargoCapacity: Int = 0,
) {
    open fun description() {
        println("Лайнер $name со скоростью $speed узлов и вместимостью в $capacity пассажиров.")
    }

    open fun loadingMethod() {
        println("Лайнер выдвигает горизонтальный трап со шкафута")
    }
}

class CargoShip1(
    name: String,
    speed: Int = 20,
    capacity: Int = 0,
    cargoCapacity: Int = 2000,
) : Liner1(name, speed, capacity, cargoCapacity) {

    override fun description() {
        println("Это грузовой корабль $name со скоростью $speed узлов и грузоподъемностью $cargoCapacity тонн.")
    }

    override fun loadingMethod() {
        println("грузовой корабль активирует погрузочный кран")
    }
}

class Icebreaker1(
    name: String,
    speed: Int = 10,
    capacity: Int = 1000,
    cargoCapacity: Int = 1000,
) : Liner1(name, speed, capacity, cargoCapacity) {

    fun breakIce() {
        println("Ледокол колет лед на своем пути.")
    }

    override fun description() {
        println(
            "Это ледокол $name со скоростью $speed узлов," +
                    " вместимостью $capacity пассажиров" +
                    " и грузоподъемностью $cargoCapacity тонн."
        )
    }

    override fun loadingMethod() {
        println("Ледокол открывает ворота со стороны кормы")
    }
}

fun main() {
val liner1 = Liner1("Titanic")
val cargoShip = CargoShip1("Alice")
val icebreaker1 = Icebreaker1("North")

    liner1.description()
    liner1.loadingMethod()

    cargoShip.description()
    cargoShip.loadingMethod()

    icebreaker1.description()
    icebreaker1.loadingMethod()

    icebreaker1.breakIce()
}