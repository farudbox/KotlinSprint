package org.example.lesson_17

class Folder(
    val folderName: String,
    val numberOfFiles: Int,
    val secret: Boolean = false,
) {
    val name: String
        get() = if (secret) "Скрытая папка" else folderName

    val files: Int
        get() = if (secret) 0 else numberOfFiles
}

fun main() {
    val secretFolder = Folder("secret", 42, true)
    val openFolder = Folder("public", 140)

    println("Имя папки: ${secretFolder.name}")
    println("Количество файлов: ${secretFolder.files}")
    println()
    println("Имя папки: ${openFolder.name}")
    println("Количество файлов: ${openFolder.files}")
}