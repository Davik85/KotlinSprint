package org.example.Lesson19

fun main() {
    val tank = Tank()

    tank.shoot()

    tank.loadAmmo(AmmoType.BLUE)
    tank.shoot()

    tank.loadAmmo(AmmoType.GREEN)
    tank.shoot()

    tank.loadAmmo(AmmoType.RED)
    tank.shoot()
}

enum class AmmoType(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20)
}

class Tank {
    private var currentAmmo: AmmoType? = null

    fun loadAmmo(ammo: AmmoType) {
        currentAmmo = ammo
        println("🔧 Tank loaded with ${ammo.name.lowercase()} ammo.")
    }

    fun shoot() {
        if (currentAmmo == null) {
            println("⚠️ Cannot shoot: no ammo loaded.")
        } else {
            println("💥 Shot fired! Damage dealt: ${currentAmmo!!.damage}")
        }
    }
}
