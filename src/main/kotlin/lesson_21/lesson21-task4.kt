package org.example.lesson_21

import java.io.File

fun File.writeWordAtStart(word: String) {
    val wordInLowerCase = word.lowercase()
    val currentContent = if (this.exists()) this.readText() else ""
    val newContent = wordInLowerCase + currentContent
    this.writeText(newContent)
}