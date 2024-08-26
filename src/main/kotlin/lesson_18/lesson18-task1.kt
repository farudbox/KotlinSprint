package org.example.lesson_18

sealed class OrderItem(val orderNumber: Int) {
    class SingleItem(orderNumber: Int, private val item: String) : OrderItem(orderNumber) {
        fun printOrder() {
            println("Заказан товар: $item")
        }
    }

    class MultipleItems(orderNumber: Int, private val items: List<String>) : OrderItem(orderNumber) {
        fun printOrder() {
            println("Заказаны следующие товары: ${items.joinToString(", ")}")
        }
    }
}

fun main() {
    val singleOrder = OrderItem.SingleItem(1, "Laptop")
    val multipleOrder = OrderItem.MultipleItems(2, listOf("Laptop", "Mouse", "Keyboard"))

    singleOrder.printOrder()
    multipleOrder.printOrder()
}