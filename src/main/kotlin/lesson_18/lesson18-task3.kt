package org.example.lesson_18

abstract class Animal(val name: String) {
    abstract fun eat()

    fun performAction(action: String) {
        println("$name -> $action")
    }

    fun sleep() {
        performAction("спит")
    }
}

class Fox(name: String) : Animal(name) {
    override fun eat() {
        performAction("лиса ест ягоды")
    }
}

class Dog(name: String) : Animal(name) {
    override fun eat() {
        performAction("собака ест кости")
    }
}

class Cat(name: String) : Animal(name) {
    override fun eat() {
        performAction("кошка ест рыбу")
    }
}

fun main() {
    val fox = Fox("fox")
    val dog = Dog("dog")
    val cat = Cat("cat")

    val animals: List<Animal> = listOf(fox, dog, cat)

    for (animal in animals) animal.eat()
}