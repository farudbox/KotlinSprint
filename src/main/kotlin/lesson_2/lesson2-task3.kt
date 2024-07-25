package org.example.lesson_2

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val departureHourToMinutes = departureHour * 60
    val departureTotalMinutes = departureHourToMinutes + departureMinute

    val travelTime = 457

    val arrivalTotalMinutes = departureTotalMinutes + travelTime
    val arrivalHour = arrivalTotalMinutes / 60
    val arrivalMinute = arrivalTotalMinutes % 60

    println("$arrivalHour:$arrivalMinute")
}