package org.example.lesson_18

data class Point(val x: Float, val y: Float)

data class Square(val sideLength: Float)

data class Circle(val radius: Float)

class Screen {

    fun draw(x: Int, y: Int, point: Point) {
        println("Рисуем точку на экране по координатам (${x.toFloat()}, ${y.toFloat()})")
    }

    fun draw(x: Float, y: Float, point: Point) {
        println("Рисуем точку на экране по координатам ($x, $y)")
    }

    fun draw(x: Int, y: Int, square: Square) {
        println("Рисуем квадрат на экране по координатам (${x.toFloat()}, ${y.toFloat()}) с длиной стороны ${square.sideLength}")
    }

    fun draw(x: Float, y: Float, square: Square) {
        println("Рисуем квадрат на экране по координатам ($x, $y) с длиной стороны ${square.sideLength}")
    }

    fun draw(x: Int, y: Int, circle: Circle) {
        println("Рисуем круг на экране по координатам (${x.toFloat()}, ${y.toFloat()}) с радиусом ${circle.radius}")
    }

    fun draw(x: Float, y: Float, circle: Circle) {
        println("Рисуем круг на экране по координатам ($x, $y) с радиусом ${circle.radius}")
    }
}

fun main() {
    val screen = Screen()

    val point = Point(3.5f, 4.5f)
    val square = Square(5.0f)
    val circle = Circle(2.5f)

    screen.draw(10, 20, point)
    screen.draw(15.5f, 25.5f, point)

    screen.draw(30, 40, square)
    screen.draw(35.5f, 45.5f, square)

    screen.draw(50, 60, circle)
    screen.draw(55.5f, 65.5f, circle)
}
