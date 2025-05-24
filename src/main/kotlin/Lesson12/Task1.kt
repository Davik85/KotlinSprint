package org.example.Lesson12

fun main() {
    val mondayWeather = DailyWeather()
    mondayWeather.dayTemperature = 22
    mondayWeather.nightTemperature = 14
    mondayWeather.hasPrecipitation = true

    val tuesdayWeather = DailyWeather()
    tuesdayWeather.dayTemperature = 27
    tuesdayWeather.nightTemperature = 17
    tuesdayWeather.hasPrecipitation = false

    println("Weather on Monday:")
    mondayWeather.printWeatherInfo()

    println("Weather on Tuesday:")
    tuesdayWeather.printWeatherInfo()
}

class DailyWeather {
    var dayTemperature: Int = 0
    var nightTemperature: Int = 0
    var hasPrecipitation: Boolean = false

    fun printWeatherInfo() {
        println("Day temperature: $dayTemperature°C")
        println("Night temperature: $nightTemperature°C")
        println("Precipitation: ${if (hasPrecipitation) "Yes" else "No"}")
        println()
    }
}