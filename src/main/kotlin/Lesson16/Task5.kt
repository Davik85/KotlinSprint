package org.example.Lesson16

fun main() {
    val player = Player("Arthas", health = 50, attackPower = 10, maxHealth = 100)

    player.printStatus()
    player.takeDamage(20)
    player.heal(30)
    player.takeDamage(70)
    player.heal(50)
    player.printStatus()
}

class Player(
    private val name: String,
    private var health: Int,
    private var attackPower: Int,
    private val maxHealth: Int
) {

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

        val healedAmount = (health + amount).coerceAtMost(maxHealth) - health
        health = (health + amount).coerceAtMost(maxHealth)
        println("💊 $name heals for $healedAmount. Health now: $health")
    }

    private fun die() {
        isAlive = false
        health = 0
        attackPower = 0
        println("☠️ $name has died.")
    }

    fun printStatus() {
        println("🧍 $name | Health: $health/$maxHealth | Attack Power: $attackPower | Alive: $isAlive")
    }
}
