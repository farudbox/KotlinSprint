package org.example.lesson_17

class QuizItem(question: String, answer: String) {
    val question: String = question
        get() {
            return field
        }

    var answer: String = answer
        get() {
            return field
        }
        set(value) {
            field = value
        }
}

fun main() {
    val quiz = QuizItem("Question?", "Answer")

    println("Question: ${quiz.question}")
    println("Answer: ${quiz.answer}")

    quiz.answer = "Lion"

    println("New answer: ${quiz.answer}")
}