package org.example.Lesson15

fun main() {
    val carp = Carp()
    val seagull = Seagull()
    val duck = Duck()

    println(carp.swim())
    println(seagull.fly())
    println(duck.swim())
    println(duck.fly())
}

class Carp : Swimmable {
    override fun swim(): String = "Carp swims calmly in the pond."
}

class Seagull : Flyable {
    override fun fly(): String = "Seagull soars high above the sea."
}

class Duck : Swimmable, Flyable {
    override fun swim(): String = "Duck paddles across the lake."
    override fun fly(): String = "Duck flaps its wings and takes off."
}

interface Swimmable {
    fun swim(): String
}

interface Flyable {
    fun fly(): String
}
