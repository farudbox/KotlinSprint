package org.example.lesson_1

fun main() {
    val totalSeconds = 6480

    val hours = totalSeconds / 3600
    val remainingSeconds = totalSeconds % 3600
    val minute = remainingSeconds / 60
    val seconds = remainingSeconds % 60

    val timeStr = String.format("%02d:%02d:%02d", hours, minute, seconds) //попросил подсказку в решении у chatGPT

    println(timeStr)
}