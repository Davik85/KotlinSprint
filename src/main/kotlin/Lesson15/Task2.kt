package org.example.Lesson15

fun main() {
    val tempData = Temperature(22.5)
    val rainData = PrecipitationAmount(12.7)

    val server = WeatherServer()

    server.sendData(tempData)
    server.sendData(rainData)
}

class WeatherServer {
    fun sendData(stat: WeatherStationStats) {
        when (stat) {
            is Temperature -> println("📡 Temperature data received: ${stat.degreesCelsius} °C")
            is PrecipitationAmount -> println("📡 Precipitation data received: ${stat.millimeters} mm")
            else -> println("❌ Unknown weather data type.")
        }
    }
}

class PrecipitationAmount(val millimeters: Double) : WeatherStationStats()

class Temperature(val degreesCelsius: Double) : WeatherStationStats()

abstract class WeatherStationStats
