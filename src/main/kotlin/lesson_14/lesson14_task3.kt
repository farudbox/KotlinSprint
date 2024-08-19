package org.example.lesson_14

import kotlin.math.PI
import kotlin.math.pow

abstract class Figure (val color: String) {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

class Circle (color: String, val radius: Double): Figure(color) {
    override fun area(): Double {
        return PI * radius.pow(2)
    }

    override fun perimeter(): Double {
        return 2 * PI * radius
    }
}

class Rectangle(color: String, val width: Double, val height: Double) : Figure(color) {
    override fun area(): Double {
        return width * height
    }

    override fun perimeter(): Double {
        return 2 * (width + height)
    }
}

fun main() {
    val figures = listOf(
        Circle("black", 5.0),
        Circle("white", 3.0),
        Rectangle("black", 4.0, 7.0),
        Rectangle("white", 6.0, 8.0),
        Circle("black", 2.5),
        Rectangle("white", 3.0, 4.0)
    )

    val blackPerimetersSum = figures
        .filter { it.color == "black" }
        .sumOf { it.perimeter() }

    val whiteAreasSum = figures
        .filter { it.color == "white" }
        .sumOf { it.area() }

    println("Сумма периметров всех черных фигур: $blackPerimetersSum")
    println("Сумма площадей всех белых фигур: $whiteAreasSum")
}