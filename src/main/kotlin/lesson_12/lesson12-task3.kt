package org.example.lesson_12

class WeatherData (dayTemperatureK: Int, nightTemperatureK: Int, precipitation: Boolean, ) {

    val dayTemperature: Int
    val nightTemperature: Int
    val precipitation: Boolean

    init {
        dayTemperature = dayTemperatureK - 273
        nightTemperature = nightTemperatureK - 273
        this.precipitation = precipitation
    }

    fun displayWeatherInfo() {
        println("Дневная температура: $dayTemperature")
        println("Ночная температура: $nightTemperature")
        println("Осадки: ${if (precipitation) "Да" else "Нет"}")
    }
}

fun main() {
    val weather1 = WeatherData(
        dayTemperatureK = 292,
        nightTemperatureK = 282,
        precipitation = false,
    )

    weather1.displayWeatherInfo()
}

