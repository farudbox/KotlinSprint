package org.example.lesson_2

fun main() {
    val numberOfStudents = 4

    val grade1 = 3.0f
    val grade2 = 4.0f
    val grade3 = 3.0f
    val grade4 = 5.0f

    val averageScore = (grade1 + grade2 + grade3 + grade4) / numberOfStudents
    val formattedScore = String.format("%.2f", averageScore)

    println(formattedScore)
}