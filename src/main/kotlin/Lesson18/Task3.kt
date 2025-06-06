package org.example.Lesson18

fun main() {
    val animals: List<Animal> = listOf(
        Fox("Foxy"),
        Dog("Rex"),
        Cat("Misty")
    )

    println("Feeding animals:")
    animals.forEach { it.eat() }
}

abstract class Animal(val nickname: String) {
    abstract fun eat()

    fun sleep() {
        println("$nickname -> is sleeping")
    }
}

class Fox(nickname: String) : Animal(nickname) {
    override fun eat() {
        println("$nickname -> eats berries")
    }
}

class Dog(nickname: String) : Animal(nickname) {
    override fun eat() {
        println("$nickname -> eats bones")
    }
}

class Cat(nickname: String) : Animal(nickname) {
    override fun eat() {
        println("$nickname -> eats fish")
    }
}

