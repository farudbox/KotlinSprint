package org.example.lesson_12

class WeatherData1(dayTemperatureK: Int, nightTemperatureK: Int, hasPrecipitation: Boolean) {
    val dayTemperature: Int
    val nightTemperature: Int
    val hasPrecipitation: Boolean

    init {
        dayTemperature = dayTemperatureK - 273
        nightTemperature = nightTemperatureK - 273
        this.hasPrecipitation = hasPrecipitation
    }
}

fun main() {
    val weatherList = mutableListOf<WeatherData1>()

    val dayTemperaturesK = listOf(273, 278, 283, 288, 293, 298, 303, 308, 313)
    val nightTemperaturesK = listOf(253, 258, 263, 268, 273, 278, 283, 288, 293)
    val precipitationOptions = listOf(true, false)

    for (i in 1..30) {
        val dayTemperatureK = dayTemperaturesK.random()
        val nightTemperatureK = nightTemperaturesK.random()
        val hasPrecipitation = precipitationOptions.random()

        val weather = WeatherData1(dayTemperatureK, nightTemperatureK, hasPrecipitation)
        weatherList.add(weather)
    }

    val dayTemperatures = weatherList.map { it.dayTemperature }
    val nightTemperatures = weatherList.map { it.nightTemperature }
    val precipitationDays = weatherList.count { it.hasPrecipitation }

    val averageDayTemperature = dayTemperatures.average()
    val averageNightTemperature = nightTemperatures.average()

    println("Средняя дневная температура за месяц: ${"%.2f".format(averageDayTemperature)}°C")
    println("Средняя ночная температура за месяц: ${"%.2f".format(averageNightTemperature)}°C")
    println("Количество дней с осадками: $precipitationDays")
}