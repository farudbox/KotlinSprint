package org.example.lesson_22

import java.time.LocalDateTime

data class GalacticGuide(
    val name: String,
    val description: String,
    val dataAndTime: LocalDateTime,
    val distance: Double,
)

fun main() {
    val alphaCentauriGuide = GalacticGuide(
        "Alpha Centauri",
        "Arrival",
        LocalDateTime.of(2024, 9, 1, 12, 0),
        4.367,
    )

    val (name, description, dataAndTime, distance) = alphaCentauriGuide

    println("Название планеты: $name")
    println("Описание события: $description")
    println("Дата и время события: $dataAndTime")
    println("Расстояние от Земли в световых годах: $distance")
}