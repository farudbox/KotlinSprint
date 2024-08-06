package org.example.lesson_4

const val MIN_CREW_COUNT = 55
const val MAX_CREW_COUNT = 70
const val SUPPLY_BOXES = 50
const val DAMAGE = true
const val GOOD_WEATHER = true

fun canShipSail(
    damage: Boolean,
    crewCount: Int,
    supplyBoxes: Int,
    weather: Boolean
): Boolean {
    return (damage != DAMAGE && crewCount in MIN_CREW_COUNT..MAX_CREW_COUNT && supplyBoxes > SUPPLY_BOXES) ||
            (damage && crewCount == MAX_CREW_COUNT && supplyBoxes >= SUPPLY_BOXES && weather == GOOD_WEATHER)
}

fun main() {
    println("Наличие повреждений корпуса (1 - есть, 0 - нет): ")
    val damageInput = readln().toInt()
    val damage = damageInput == 1

    println("Текущий состав экипажа: ")
    val crewCount = readln().toInt()

    println("Количество ящиков с провизией на борту: ")
    val supplyBoxes = readln().toInt()

    println("Благоприятность метеоусловий (1 - благоприятные, 0 - неблагоприятные): ")
    val weatherInput = readln().toInt()
    val weather = weatherInput == 1

    if (canShipSail(damage, crewCount, supplyBoxes, weather)) {
        println("Корабль может отправиться в плавание.")
    } else {
        println("Корабль не может отправиться в плавание.")
    }
}