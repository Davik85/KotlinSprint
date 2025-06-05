package org.example.Lesson18

fun main() {
    val singleItemOrder = Order(1001)
    singleItemOrder.printOrderInfo("Wireless Mouse")

    val multipleItemsOrder = Order(1002)
    multipleItemsOrder.printOrderInfo(listOf("Keyboard", "Monitor", "Webcam"))
}

class Order(private val orderNumber: Int) {

    fun printOrderInfo(item: String) {
        println("Order #$orderNumber")
        println("Ordered item: $item")
    }

    fun printOrderInfo(items: List<String>) {
        println("Order #$orderNumber")
        println("Ordered items: ${items.joinToString(", ")}")
    }
}
