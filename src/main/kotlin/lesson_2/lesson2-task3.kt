package org.example.lesson_2

const val SECONDS_IN_HOUR = 60

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val departureHourToMinutes = departureHour * SECONDS_IN_HOUR
    val departureTotalMinutes = departureHourToMinutes + departureMinute

    val travelTime = 457

    val arrivalTotalMinutes = departureTotalMinutes + travelTime
    val arrivalHour = arrivalTotalMinutes / SECONDS_IN_HOUR
    val arrivalMinute = arrivalTotalMinutes % SECONDS_IN_HOUR

    println("$arrivalHour:$arrivalMinute")
}