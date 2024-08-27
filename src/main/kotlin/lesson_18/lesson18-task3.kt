package org.example.lesson_18

abstract class Animal(val name: String) {
    abstract fun eat()

    fun sleep(name: String) {
        println("$name -> спит")
    }
}

class Fox(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> лиса ест ягоды")
    }
}

class Dog(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> собака ест кости")
    }
}

class Cat(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> кошка ест рыбу")
    }
}

fun main() {
    val fox = Fox("fox")
    val dog = Dog("dog")
    val cat = Cat("cat")

    val animals: List<Animal> = listOf(fox, dog, cat)

    for (animal in animals) animal.eat()
}