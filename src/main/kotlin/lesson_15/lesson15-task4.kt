package org.example.lesson_15

abstract class Product (
    val name: String,
    val quantity: Int
)

interface FindComponents {
    fun findComponent(component: String) {
        println("Выполняется поиск")
    }
}

class Instrument (name: String, quantity: Int) : Product(name, quantity), FindComponents {
    override fun findComponent(component: String) {
        println("Выполняется поиск $component для инструмента $name")
    }
}

class Component (name: String, quantity: Int) : Product(name, quantity)

fun main() {
    val guitar = Instrument("Guitar", 32)
    val strings = Component("Strings", 123)
    val drum = Instrument("Drum", 4)
    val drumsticks = Component("Drumsticks", 56)

    guitar.findComponent(strings.name)
    drum.findComponent(drumsticks.name)
}