package org.example.lesson_18

class Order(val orderNum: Int) {
    fun printOrder(item: String) {
        println("Заказан товар: $item")
    }

    fun printOrder(items: List<String>) {
        println("Заказан товар: ${items.joinToString(", ")}")
    }
}

fun main() {
    val singleOrder = Order(1)

    val multipleOrder = Order(2)

    singleOrder.printOrder("Laptop")
    multipleOrder.printOrder(listOf("Laptop", "Mouse", "Keyboard"))
}