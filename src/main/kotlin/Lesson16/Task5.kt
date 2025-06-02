package org.example.Lesson16

fun main() {
    val player = Player("Arthas", health = 50, attackPower = 10)

    player.printStatus()
    player.takeDamage(20)
    player.heal(10)
    player.takeDamage(40)
    player.heal(30)
    player.takeDamage(10)
    player.printStatus()
}

class Player(val name: String, private var health: Int, private var attackPower: Int) {

    private var isAlive: Boolean = true

    fun takeDamage(amount: Int) {
        if (!isAlive) {
            println("💀 $name is already dead. Damage ignored.")
            return
        }

        health -= amount
        println("💢 $name takes $amount damage. Health now: ${health.coerceAtLeast(0)}")

        if (health <= 0) {
            die()
        }
    }

    fun heal(amount: Int) {
        if (!isAlive) {
            println("💊 Cannot heal $name. Player is dead.")
            return
        }

        health += amount
        println("💊 $name heals for $amount. Health now: $health")
    }

    private fun die() {
        isAlive = false
        health = 0
        attackPower = 0
        println("☠️ $name has died.")
    }

    fun printStatus() {
        println("🧍 $name | Health: $health | Attack Power: $attackPower | Alive: $isAlive")
    }
}
