package org.example.lesson_16

class Order(private val orderNumber: Int, private var orderStatus: String) {

    fun changeOrderStatus(newStatus: String) {
        println("Запрос передан менеджеру")
        orderStatus = newStatus
        println("Статус заказа $orderNumber изменен на $orderStatus")
    }
}

fun main() {
    val order = Order(15, "В пути")

    order.changeOrderStatus("Готов к выдаче")
}