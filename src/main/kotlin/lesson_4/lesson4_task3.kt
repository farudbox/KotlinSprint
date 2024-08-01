package org.example.lesson_4

const val IS_SUNNY = true
const val IS_TENT_OPEN = true
const val HUMIDITY = 20
const val WINTER = "зима"

fun main() {
    val isSunny = true
    val isTentOpen = true
    val humidity = 20
    val currentSeason = "зима"

    val isFavorable = (isSunny == IS_SUNNY) && (isTentOpen == IS_TENT_OPEN) && (humidity == HUMIDITY) && (currentSeason != WINTER)

    println("Благоприятны ли условия сейчас для роста бобовых? $isFavorable")
}