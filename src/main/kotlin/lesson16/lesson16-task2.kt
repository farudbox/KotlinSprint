package org.example.lesson16

class Circle(private val r: Int) {
    companion object {
        private const val Pi = 3.14
    }

    fun circumference(): Double {
        return 2 * Pi * r
    }

    fun area(): Double {
        return Pi * (r * r)
    }
}

fun main() {
    val circle = Circle(4)

    println(circle.circumference())
    println(circle.area())
}