package org.example.lesson_15

interface Floating {
    fun swim()
}

interface Flyable {
    fun fly()
}

interface Walking {
    fun walk()
}

class Carp(): Floating {
    override fun swim() {
        println("Карась плавает в воде")
    }
}

class Seagull(): Flyable, Walking {
    override fun fly() {
        println("Чайка летит в небе")
    }
    override fun walk() {
        println("Чайка ходит по земле")
    }
}

class Duck(): Floating, Flyable, Walking {
    override fun swim() {
        println("Утка плавает в воде")
    }

    override fun fly() {
        println("Утка летит в небе")
    }

    override fun walk() {
        println("Утка ходит по земле")
    }
}

fun main() {
    val carp = Carp()
    val seagull = Seagull()
    val duck = Duck()

    carp.swim()

    seagull.walk()
    seagull.fly()

    duck.swim()
    duck.walk()
    duck.fly()
}