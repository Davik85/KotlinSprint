package org.example.Lesson16

fun main() {
    val order = Order(1001)
    order.printStatus()

    order.requestStatusUpdate("Shipped")
    order.printStatus()
}

class Order(private val orderNumber: Int) {

    private var status: String = "Pending"

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
