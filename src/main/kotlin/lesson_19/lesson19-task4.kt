package org.example.lesson_19

enum class Ammo(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank {
    private var currentAmmo: Ammo? = null

    fun loadAmmo(ammo: Ammo) {
        currentAmmo = ammo
        println("Танк заряжен ${ammo.name} снарядом")
    }

    fun shoot() {
        if (currentAmmo != null) {
            println("Выстрел нанес урон ${currentAmmo?.damage}")
            currentAmmo = null
        } else println("Танк не заряжен! Выстрел невозможен.")
    }
}

fun main() {
    val tank = Tank()

    tank.shoot()

    tank.loadAmmo(Ammo.BLUE)
    tank.shoot()

    tank.loadAmmo(Ammo.GREEN)
    tank.shoot()

    tank.loadAmmo(Ammo.RED)
    tank.shoot()
}