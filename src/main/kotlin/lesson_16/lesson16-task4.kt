package org.example.lesson_16

class Order(private val orderNumber: Int, private var orderStatus: String) {

    private fun changeOrderStatus(newStatus: String) {
        orderStatus = newStatus
        println("Статус заказа $orderNumber изменен на $orderStatus")
    }

    fun requestOrderStatusChange(newStatus: String) {
        println("Запрос передан менеджеру")
        changeOrderStatus(newStatus)
    }
}

fun main() {
    val order = Order(15, "В пути")

    order.requestOrderStatusChange("Готов к выдаче")
}