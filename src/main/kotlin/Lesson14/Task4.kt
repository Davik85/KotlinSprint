package org.example.Lesson14

fun main() {
    val lumina = Moon(name = "Lumina", hasAtmosphere = false, isLandable = false)
    val terron = Moon(name = "Terron", hasAtmosphere = true, isLandable = true)

    val gaelora = Planet(
        name = "Gaelora",
        hasAtmosphere = true,
        isLandable = true,
        moons = listOf(lumina, terron)
    )

    println("🌍 Planet created: ${gaelora.name}")
    println("☁️ Atmosphere: ${gaelora.hasAtmosphere}")
    println("🛬 Landable: ${gaelora.isLandable}")
    println("\n🌑 Moons orbiting ${gaelora.name}:")

    gaelora.moons.forEach { moon ->
        println(" - ${moon.name} | Atmosphere: ${moon.hasAtmosphere} | Landable: ${moon.isLandable}")
    }
}

open class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val isLandable: Boolean
)

class Moon(
    name: String,
    hasAtmosphere: Boolean,
    isLandable: Boolean
) : CelestialBody(name, hasAtmosphere, isLandable)

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isLandable: Boolean,
    val moons: List<Moon>
) : CelestialBody(name, hasAtmosphere, isLandable)
