package org.example.Lesson12

class WeatherDay(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val hasPrecipitation: Boolean
) {
    fun printWeatherInfo() {
        println("Day temperature: $dayTemperature°C")
        println("Night temperature: $nightTemperature°C")
        println("Precipitation: ${if (hasPrecipitation) "Yes" else "No"}")
    }
}
