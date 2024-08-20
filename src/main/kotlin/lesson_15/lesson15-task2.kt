package org.example.lesson_15

abstract class WeatherStationStats(val dataType: String)

class Temperature(val temperature: String) : WeatherStationStats("Temperature")

class PrecipitationAmount(val precipitation: String) : WeatherStationStats("Precipitation")

class WeatherServer {
    fun sendMessage(data: WeatherStationStats) {
        when(data) {
            is Temperature -> println(
                "Отправка данных о температуре: ${data.temperature}°C на сервер")
            is PrecipitationAmount -> println(
                "Отправка данных о количестве осадков: ${data.precipitation} мм на сервер")
            else -> println("Неизвестный тип данных")
        }
    }
}

fun main() {
    val temperature = Temperature("21,1")
    val precipitation = PrecipitationAmount("12,2")
    val weatherServer = WeatherServer()

    weatherServer.sendMessage(temperature)
    weatherServer.sendMessage(precipitation)
}