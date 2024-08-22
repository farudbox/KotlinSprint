package org.example.lesson_14

import kotlin.math.PI
import kotlin.math.pow

const val COLOR_BLACK = "black"
const val COLOR_WHITE = "white"

abstract class Figure(val color: String) {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

class Circle(color: String, val radius: Double): Figure(color) {
    override fun area(): Double {
        return PI * radius.pow(2)
    }

    override fun perimeter(): Double {
        return 2 * PI * radius
    }
}

class Rectangle(color: String, val width: Double, val height: Double): Figure(color) {
    override fun area(): Double {
        return width * height
    }

    override fun perimeter(): Double {
        return 2 * (width + height)
    }
}

fun main() {
    val figures = listOf(
        Circle(color = COLOR_BLACK, radius = 5.0),
        Circle(color = COLOR_WHITE, radius = 3.0),
        Rectangle(color = COLOR_BLACK, width = 4.0, height = 7.0),
        Rectangle(color = COLOR_WHITE, width = 6.0, height = 8.0),
        Circle(color = COLOR_BLACK, radius = 2.5),
        Rectangle(color = COLOR_WHITE, width = 3.0, height = 4.0)
    )

    val blackPerimetersSum = figures
        .filter { it.color == COLOR_BLACK }
        .sumOf { it.perimeter() }

    val whiteAreasSum = figures
        .filter { it.color == COLOR_WHITE }
        .sumOf { it.area() }

    println("Сумма периметров всех черных фигур: $blackPerimetersSum")
    println("Сумма площадей всех белых фигур: $whiteAreasSum")
}
