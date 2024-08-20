package org.example.lesson_14

open class CelestialBody(
    val name: String,
    val atmosphere: Boolean,
    val habitable: Boolean,
) {
    open fun description() {
        println("Небесное тело: $name")
        println("Атмосфера: ${if (atmosphere) "да" else "нет"}")
        println("Пригодна для высадки: ${if (habitable) "да" else "нет"}")
    }
}

class Planet(
    name: String,
    atmosphere: Boolean,
    habitable: Boolean,
    val moons: List<Moon> = emptyList()
) : CelestialBody(name, atmosphere, habitable) {

    override fun description() {
        super.description()
        if (moons.isNotEmpty()) {
            println("Спутники: ")
            moons.forEach { moon -> println("- ${moon.name}") }
        }
    }
}

class Moon(
    name: String,
    atmosphere: Boolean = false,
    habitable: Boolean = false,
) : CelestialBody(name, atmosphere, habitable)

fun main() {
    val moon1 = Moon(name = "Спутник-1")
    val moon2 = Moon(name = "Спутник-2")

    val planet = Planet(
        name = "Планета-1",
        atmosphere = true,
        habitable = true,
        moons = listOf(moon1, moon2)
    )

    planet.description()
}
