package org.example.lesson_4

fun canShipSail(
    damage: Boolean,
    crewCount: Int,
    supplyBoxes: Int,
    weather: Boolean
): Boolean {
    return (!damage && crewCount in 55..70 && supplyBoxes > 50) ||
            (damage && crewCount == 70 && supplyBoxes >= 50 && weather)
}

fun main() {
    println("Наличие повреждений корпуса (1 - есть, 0 - нет): ")
    val damageInput = readLine()!!.toInt()
    val damage = damageInput == 1

    println("Текущий состав экипажа: ")
    val crewCount = readLine()!!.toInt()

    println("Количество ящиков с провизией на борту: ")
    val supplyBoxes = readLine()!!.toInt()

    println("Благоприятность метеоусловий (1 - благоприятные, 0 - неблагоприятные): ")
    val weatherInput = readLine()!!.toInt()
    val weather = weatherInput == 1

    if (canShipSail(damage, crewCount, supplyBoxes, weather)) {
        println("Корабль может отправиться в плавание.")
    } else {
        println("Корабль не может отправиться в плавание.")
    }
}