package org.example.Lesson19

fun main() {
    val products = listOf(
        Product("T-shirt", 1001, Category.CLOTHING),
        Product("Notebook", 1002, Category.STATIONERY),
        Product("Mug", 1003, Category.OTHER)
    )

    products.forEach { it.printInfo() }
}

enum class Category {
    CLOTHING,
    STATIONERY,
    OTHER;

    fun displayName(): String {
        return when (this) {
            CLOTHING -> "Clothing"
            STATIONERY -> "Stationery"
            OTHER -> "Miscellaneous"
        }
    }
}

class Product(
    private val name: String,
    private val id: Int,
    private val category: Category
) {
    fun printInfo() {
        println("Product: $name | ID: $id | Category: ${category.displayName()}")
    }
}
