package org.example.Lesson12

fun main() {
    WeatherReport(298.0, 289.0, true)
}

const val KELVIN_TO_CELSIUS_OFFSET1 = 273.15

class WeatherReport(
    dayTemperatureK: Double,
    nightTemperatureK: Double,
    hasPrecipitationInput: Boolean
) {
    val dayTemperature: Int
    val nightTemperature: Int
    val hasPrecipitation: Boolean

    init {
        dayTemperature = (dayTemperatureK - KELVIN_TO_CELSIUS_OFFSET1).toInt()
        nightTemperature = (nightTemperatureK - KELVIN_TO_CELSIUS_OFFSET1).toInt()
        hasPrecipitation = hasPrecipitationInput

        println("Day temperature: $dayTemperature°C")
        println("Night temperature: $nightTemperature°C")
        println("Precipitation: ${if (hasPrecipitation) "Yes" else "No"}")
    }
}
