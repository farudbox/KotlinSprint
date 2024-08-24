package org.example.lesson_17

class Parcel(
    val id: Int,
    initialLocation: String,
) {
    var currentLocation: String = initialLocation
        set(value) {
            field = value
            movementCounter++
        }

    var movementCounter: Int = 0
        private set

    fun displayInfo() {
        println("Номер заказа: $id")
        println("Местоположение: $currentLocation")
        println("Количество перемещений: $movementCounter")
    }
}

fun main() {
    val parcel = Parcel(10, "Пекин")

    parcel.displayInfo()

    parcel.currentLocation = "Владивосток"
    parcel.displayInfo()

    parcel.currentLocation = "Москва"
    parcel.displayInfo()
}