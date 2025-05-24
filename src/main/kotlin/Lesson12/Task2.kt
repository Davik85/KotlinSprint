package org.example.Lesson12

fun main() {
    val weather = WeatherDay(
        dayTemperature = 25,
        nightTemperature = 15,
        hasPrecipitation = true
    )

    weather.printWeatherInfo()
}


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
