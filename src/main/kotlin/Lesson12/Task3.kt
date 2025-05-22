package org.example.Lesson12

fun main() {
    val snapshot = WeatherSnapshot(
        dayTemperatureK = 298.0,
        nightTemperatureK = 289.0,
        hasPrecipitationInput = true
    )

    snapshot.printWeatherInfo()
}

class WeatherSnapshot(
    dayTemperatureK: Double,
    nightTemperatureK: Double,
    hasPrecipitationInput: Boolean
) {
    val dayTemperature: Int
    val nightTemperature: Int
    val hasPrecipitation: Boolean

    init {
        dayTemperature = (dayTemperatureK - KELVIN_TO_CELSIUS_OFFSET).toInt()
        nightTemperature = (nightTemperatureK - KELVIN_TO_CELSIUS_OFFSET).toInt()
        hasPrecipitation = hasPrecipitationInput
    }

    fun printWeatherInfo() {
        println("Day temperature: $dayTemperature°C")
        println("Night temperature: $nightTemperature°C")
        println("Precipitation: ${if (hasPrecipitation) "Yes" else "No"}")
    }
}

const val KELVIN_TO_CELSIUS_OFFSET = 273.15
