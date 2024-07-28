package org.example.lesson_1

const val UNIT_OF_TIME_IN_UNIT_OF_TIME = 60
const val UNIT_OF_TIME_IN_UNIT_OF_TIME_ABOVE = UNIT_OF_TIME_IN_UNIT_OF_TIME * UNIT_OF_TIME_IN_UNIT_OF_TIME

fun main() {
    val totalSeconds = 6480

    val hours = totalSeconds / UNIT_OF_TIME_IN_UNIT_OF_TIME_ABOVE
    val remainingSeconds = totalSeconds % UNIT_OF_TIME_IN_UNIT_OF_TIME_ABOVE
    val minute = remainingSeconds / UNIT_OF_TIME_IN_UNIT_OF_TIME
    val seconds = remainingSeconds % UNIT_OF_TIME_IN_UNIT_OF_TIME

    val timeStr = String.format("%02d:%02d:%02d", hours, minute, seconds) //попросил подсказку в решении у chatGPT

    println(timeStr)
}