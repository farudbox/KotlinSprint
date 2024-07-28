package org.example.lesson_2

const val UNIT_OF_TIME_IN_UNIT_OF_TIME = 60

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val departureHourToMinutes = departureHour * UNIT_OF_TIME_IN_UNIT_OF_TIME
    val departureTotalMinutes = departureHourToMinutes + departureMinute

    val travelTime = 457

    val arrivalTotalMinutes = departureTotalMinutes + travelTime
    val arrivalHour = arrivalTotalMinutes / UNIT_OF_TIME_IN_UNIT_OF_TIME
    val arrivalMinute = arrivalTotalMinutes % UNIT_OF_TIME_IN_UNIT_OF_TIME

    println("$arrivalHour:$arrivalMinute")
}