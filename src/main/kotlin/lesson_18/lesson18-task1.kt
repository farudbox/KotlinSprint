package org.example.lesson_18

class OrderItem {

    fun printOrder(item: String) {
        println("Заказан товар: $item")
    }

    fun printOrder(items: List<String>) {
        println("Заказан товар: ${items.joinToString(", ")}}")
    }
}

fun main() {
    val order = OrderItem()

    order.printOrder("Laptop")
    order.printOrder(listOf("Laptop", "Mouse", "Keyboard"))
}