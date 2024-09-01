package org.example.lesson_20

import kotlin.random.Random

class Robot {
    private val phrases = listOf(
        "Привет, мир!",
        "Как дела?",
        "Сегодня прекрасный день!",
        "Я родился!",
        "Что нового в мире технологий?",
    )

    private var modifier: ((String) -> String)? = null

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }

    fun say() {
        val phrase = phrases[Random.nextInt(phrases.size)]
        val modifiedPhrase = modifier?.invoke(phrase) ?: phrase
        println(modifiedPhrase)
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