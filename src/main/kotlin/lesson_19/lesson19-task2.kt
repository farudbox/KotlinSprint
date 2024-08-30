package org.example.lesson_19

enum class Categories(private val displayName: String) {
    CLOTH("Одежда"), STATIONERY("Канцелярские товары"), MISCELLANEOUS("Разное");

    fun getCategoryName(): String {
        return displayName
    }
}

class Product(val name: String, val id: Int, val categories: Categories) {
    fun printInfo() {
        println("Название: $name")
        println("ID товара: $id")
        println("Категория: ${categories.getCategoryName()}")
    }
}

fun main() {
    val product1 = Product("Футболка", 101, Categories.CLOTH)
    val product2 = Product("Ручка", 201, Categories.STATIONERY)
    val product3 = Product("Сувенир", 301, Categories.MISCELLANEOUS)

    product1.printInfo()
    println()
    product2.printInfo()
    println()
    product3.printInfo()
}