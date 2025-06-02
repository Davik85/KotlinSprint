package org.example.Lesson16

fun main() {
    val order = Order(orderNumber = 1001, status = "Pending")
    order.printStatus()

    order.requestStatusUpdate("Shipped")
    order.printStatus()
}

class Order(
    val orderNumber: Int,
    private var status: String
) {
    fun printStatus() {
        println("Order #$orderNumber status: $status")
    }

    private fun updateStatus(newStatus: String) {
        status = newStatus
    }

    fun requestStatusUpdate(newStatus: String) {
        println("Manager requested status update to \"$newStatus\" for order #$orderNumber")
        updateStatus(newStatus)
    }
}
