package org.example.lesson_20

class Robot {
    private val phrases = listOf(
        "Привет, мир!",
        "Как дела?",
        "Сегодня прекрасный день!",
        "Я родился!",
        "Что нового в мире технологий?",
    )

    private var modifier: (String) -> String = { it }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }

    fun say() {
        println(modifier(phrases.random()))
    }
}

fun main() {
    val robot = Robot()

    robot.say()

    robot.setModifier { phrase: String ->
        phrase.split(" ").reversed().joinToString(" ")
    }

    robot.say()
}