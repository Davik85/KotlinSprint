package org.example.Lesson15

const val MAX_TRUCK_PASSENGERS = 1
const val MAX_TRUCK_CARGO_TONS = 2
const val MAX_CAR_PASSENGERS = 3

fun main() {
    val truck = Truck()
    val car1 = Car()
    val car2 = Car()

    println("\n--- Passenger Transport ---")
    car1.loadPassengers(3)
    car1.move()
    car1.unloadPassengers()

    car2.loadPassengers(2)
    car2.move()
    car2.unloadPassengers()

    truck.loadPassengers(1)
    truck.move()
    truck.unloadPassengers()

    println("\n--- Cargo Transport ---")
    truck.loadCargo(2)
    truck.move()
    truck.unloadCargo()
}

class Car : Movable, PassengerTransportable {
    override val maxPassengers = MAX_CAR_PASSENGERS
    override var currentPassengers = 0

    override fun move() {
        println("🚗 Car is moving...")
    }

    override fun loadPassengers(count: Int) {
        val toLoad = minOf(count, maxPassengers - currentPassengers)
        currentPassengers += toLoad
        println("🧍 Loaded $toLoad passenger(s) into the car.")
    }

    override fun unloadPassengers() {
        println("🧍 Unloaded $currentPassengers passenger(s) from the car.")
        currentPassengers = 0
    }
}

class Truck : Movable, PassengerTransportable, CargoTransportable {
    override val maxPassengers = MAX_TRUCK_PASSENGERS
    override var currentPassengers = 0

    override val maxCargoTons = MAX_TRUCK_CARGO_TONS
    override var currentCargoTons = 0

    override fun move() {
        println("🚚 Truck is moving...")
    }

    override fun loadPassengers(count: Int) {
        val toLoad = minOf(count, maxPassengers - currentPassengers)
        currentPassengers += toLoad
        println("🧍 Loaded $toLoad passenger(s) into the truck.")
    }

    override fun unloadPassengers() {
        println("🧍 Unloaded $currentPassengers passenger(s) from the truck.")
        currentPassengers = 0
    }

    override fun loadCargo(tons: Int) {
        val toLoad = minOf(tons, maxCargoTons - currentCargoTons)
        currentCargoTons += toLoad
        println("📦 Loaded $toLoad ton(s) of cargo into the truck.")
    }

    override fun unloadCargo() {
        println("📦 Unloaded $currentCargoTons ton(s) of cargo from the truck.")
        currentCargoTons = 0
    }
}

interface Movable {
    fun move()
}

interface PassengerTransportable {
    val maxPassengers: Int
    var currentPassengers: Int

    fun loadPassengers(count: Int)
    fun unloadPassengers()
}

interface CargoTransportable {
    val maxCargoTons: Int
    var currentCargoTons: Int

    fun loadCargo(tons: Int)
    fun unloadCargo()
}
