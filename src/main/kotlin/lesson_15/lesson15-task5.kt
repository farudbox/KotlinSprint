package org.example.lesson_15

interface Movable {
    fun move()
}

interface PassengerTransport {
    val maxPassengers: Int
    var currentPassengers: Int

    fun loadPassenger(count: Int)
    fun unloadPassenger(count: Int)
}

interface CargoTransport {
    val maxCargoWeight: Double
    var currentCargoWeight: Double

    fun loadCargo(weight: Double)
    fun unloadCargo(weight: Double)
}

class Truck : Movable, PassengerTransport, CargoTransport {
    override val maxPassengers: Int = 1
    override var currentPassengers: Int = 0

    override val maxCargoWeight: Double = 2.0
    override var currentCargoWeight: Double = 0.0

    override fun move() {
        println("Грузовик в движении.")
    }

    override fun loadPassenger(count: Int) {
        if (currentPassengers + count > maxPassengers) {
            println("Не удалось загрузить пассажиров: превышен лимит пассажиров.")
        } else {
            currentPassengers += count
            println("Загружено $count пассажиров. Текущее количество пассажиров: $currentPassengers.")
        }
    }

    override fun unloadPassenger(count: Int) {
        if (currentPassengers - count < 0) {
            println("Не удалось выгрузить пассажиров: недостаточно пассажиров.")
        } else {
            currentPassengers -= count
            println("Выгружено $count пассажиров. Текущее количество пассажиров: $currentPassengers.")
        }
    }

    override fun loadCargo(weight: Double) {
        if (currentCargoWeight + weight > maxCargoWeight) {
            println("Не удалось загрузить груз: превышен лимит грузоподъемности.")
        } else {
            currentCargoWeight += weight
            println("Загружено $weight тонн груза. Текущий вес груза: $currentCargoWeight тонн.")
        }
    }

    override fun unloadCargo(weight: Double) {
        if (currentCargoWeight - weight < 0) {
            println("Не удалось выгрузить груз: недостаточно груза.")
        } else {
            currentCargoWeight -= weight
            println("Выгружено $weight тонн груза. Текущий вес груза: $currentCargoWeight тонн.")
        }
    }
}

class Car : Movable, PassengerTransport {
    override val maxPassengers: Int = 3
    override var currentPassengers: Int = 0

    override fun move() {
        println("Легковой автомобиль в движении.")
    }

    override fun loadPassenger(count: Int) {
        if (currentPassengers + count > maxPassengers) {
            println("Не удалось загрузить пассажиров: превышен лимит пассажиров.")
        } else {
            currentPassengers += count
            println("Загружено $count пассажиров. Текущее количество пассажиров: $currentPassengers.")
        }
    }

    override fun unloadPassenger(count: Int) {
        if (currentPassengers - count < 0) {
            println("Не удалось выгрузить пассажиров: недостаточно пассажиров.")
        } else {
            currentPassengers -= count
            println("Выгружено $count пассажиров. Текущее количество пассажиров: $currentPassengers.")
        }
    }
}

fun main() {
    val truck = Truck()
    val car = Car()

    car.loadPassenger(3)
    car.move()
    car.unloadPassenger(3)

    truck.loadPassenger(1)
    truck.move()
    truck.unloadPassenger(1)

    truck.loadCargo(2.0)
    truck.move()
    truck.unloadCargo(2.0)
}
