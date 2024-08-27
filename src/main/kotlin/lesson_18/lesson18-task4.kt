package org.example.lesson_18

abstract class Box {
    abstract fun surfaceArea(): Int
}

class RectangularBox(
    private val length: Int, private val width: Int, private val height: Int
) : Box() {
    override fun surfaceArea(): Int {
        return 2 * (length * width + width * height + height * length)
    }
}

class CubeBox(private val edgeLength: Int) : Box() {
    override fun surfaceArea(): Int {
        return 6 * edgeLength * edgeLength
    }
}

fun main() {
    val rectangularBox = RectangularBox(2, 3, 4)

    val cubeBox = CubeBox(2)

    println("Площадь поверхности прямоугольной коробки: ${rectangularBox.surfaceArea()}")
    println("Площадь поверхности кубической коробки: ${cubeBox.surfaceArea()}")
}
