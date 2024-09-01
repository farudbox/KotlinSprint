package org.example.lesson_21

fun String.vowelCount(): Int {
    val vowels = "aeiouAEIOU"
    return this.count {it in vowels}
}

fun main() {
    val hello = "hello"
    println(hello.vowelCount())
}