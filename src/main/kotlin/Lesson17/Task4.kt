package org.example.Lesson17

fun main() {
    val parcel = Parcel("PKG-20250604", "Moscow")

    parcel.location = "Voronezh"
    parcel.location = "Kazan"
    parcel.location = "Ufa"

    println("Parcel number: ${parcel.trackingNumber}")
    println("Current location: ${parcel.location}")
    println("Number of transfers: ${parcel.transferCount}")
}

class Parcel(val trackingNumber: String, initialLocation: String) {

    var transferCount: Int = 0
        private set

    var location: String = initialLocation
        set(value) {
            field = value
            transferCount++
        }
}
