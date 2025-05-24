package org.example.Lesson12

import kotlin.random.Random

fun main() {
    val weatherMonth = List(30) {
        val dayK = Random.nextDouble(273.15, 313.15)   // 0°C to 40°C
        val nightK = Random.nextDouble(263.15, 298.15) // -10°C to 25°C
        val precipitation = Random.nextBoolean()
        WeatherReport(dayK, nightK, precipitation)
    }

    val dayTemps = weatherMonth.map { it.dayTemperature }
    val nightTemps = weatherMonth.map { it.nightTemperature }
    val daysWithPrecipitation = weatherMonth.count { it.hasPrecipitation }

    val avgDayTemp = dayTemps.average()
    val avgNightTemp = nightTemps.average()

    println("Monthly weather report:")
    println("Average daytime temperature: ${"%.1f".format(avgDayTemp)}°C")
    println("Average nighttime temperature: ${"%.1f".format(avgNightTemp)}°C")
    println("Days with precipitation: $daysWithPrecipitation out of ${weatherMonth.size}")
}

const val KELVIN_TO_CELSIUS_OFFSET2 = 273.15

class WeatherReport(
    dayTemperatureK: Double,
    nightTemperatureK: Double,
    hasPrecipitationInput: Boolean
) {
    val dayTemperature: Int
    val nightTemperature: Int
    val hasPrecipitation: Boolean

    init {
        dayTemperature = (dayTemperatureK - KELVIN_TO_CELSIUS_OFFSET2).toInt()
        nightTemperature = (nightTemperatureK - KELVIN_TO_CELSIUS_OFFSET2).toInt()
        hasPrecipitation = hasPrecipitationInput
    }
}