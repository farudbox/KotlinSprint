package org.example.lesson_18

sealed class OrderItem {
    abstract fun printOrder()
}

data class SingleItem(val item: String) : OrderItem() {
    override fun printOrder() {
        println("Заказан товар: $item")
    }
}

data class MultipleItem(val items: List<String>) : OrderItem() {
    override fun printOrder() {
        val itemsList = items.joinToString(", ")
        println("Заказан товар: $itemsList")
    }
}

data class Order(val orderNumber: Int, val orderItem: OrderItem)

fun main() {
    val singleOrder = Order(
        orderNumber = 1,
        orderItem = SingleItem("Laptop")
    )

    val multipleOrder = Order(
        orderNumber = 2,
        orderItem = MultipleItem(listOf("Laptop", "Mouse", "Keyboard"))
    )

    singleOrder.orderItem.printOrder()
    multipleOrder.orderItem.printOrder()
}
