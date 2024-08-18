package org.example.lesson_12

class Weather (
    var dayTemperature: Int,
    var nightTemperature: Int,
    var precipitation: Boolean,
) {
    fun displayWeatherInfo() {
        println("Дневная температура: $dayTemperature")
        println("Ночная температура: $nightTemperature")
        println("Осадки: ${if (precipitation) "Да" else "Нет"}")
    }
}

fun main() {
    val weather1 = Weather(
        dayTemperature = 25,
        nightTemperature = 10,
        precipitation = false,
    )

    val weather2 = Weather(
        dayTemperature = 15,
        nightTemperature = 5,
        precipitation = true,
    )

    weather1.displayWeatherInfo()
    println()
    weather2.displayWeatherInfo()
}