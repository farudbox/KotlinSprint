package org.example.lesson_2

const val minutesInHour = 60

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val departureHourToMinutes = departureHour * minutesInHour
    val departureTotalMinutes = departureHourToMinutes + departureMinute

    val travelTime = 457

    val arrivalTotalMinutes = departureTotalMinutes + travelTime
    val arrivalHour = arrivalTotalMinutes / minutesInHour
    val arrivalMinute = arrivalTotalMinutes % minutesInHour

    println("$arrivalHour:$arrivalMinute")
}