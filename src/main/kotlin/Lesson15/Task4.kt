package org.example.Lesson15

fun main() {
    val guitar = Instrument("Electric Guitar", 5)
    val strings = Accessory("Guitar Strings", 20)

    println("🎸 Product: ${guitar.name} | In stock: ${guitar.stock}")
    guitar.searchAccessories()

    println("\n🧩 Product: ${strings.name} | In stock: ${strings.stock}")
}

open class Product(
    val name: String,
    val stock: Int
)

class Instrument(
    name: String,
    stock: Int
) : Product(name, stock), Searchable {

    override fun searchAccessories() {
        println("🔍 Searching accessories for instrument: \"$name\"...")
    }
}

class Accessory(
    name: String,
    stock: Int
) : Product(name, stock)

interface Searchable {
    fun searchAccessories()
}
