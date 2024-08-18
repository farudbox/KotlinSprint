package org.example.lesson_12

class WeatherInfo (
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
    val weather1 = WeatherInfo(
        dayTemperature = 25,
        nightTemperature = 10,
        precipitation = false,
    )

    println(weather1.displayWeatherInfo())
}