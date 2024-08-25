package org.example.lesson_18

abstract class Box {
    abstract fun surfaceArea(): Int
}

class RectangularBox(
    private val length: Int,
    private val width: Int,
    private val height: Int
) : Box() {
    companion object {
        const val SURFACE_AREA_MULTIPLIER = 2
    }

    override fun surfaceArea(): Int {
        return SURFACE_AREA_MULTIPLIER * (length * width + width * height + height * length)
    }
}

class CubeBox(private val edgeLength: Int) : Box() {
    companion object {
        const val NUM_SIDES_CUBE = 6
    }

    override fun surfaceArea(): Int {
        return NUM_SIDES_CUBE * edgeLength * edgeLength
    }
}

fun main() {
    val rectangularBox = RectangularBox(2, 3, 4)

    val cubeBox = CubeBox(2)

    println("Площадь поверхности прямоугольной коробки: ${rectangularBox.surfaceArea()}")
    println("Площадь поверхности кубической коробки: ${cubeBox.surfaceArea()}")
}
