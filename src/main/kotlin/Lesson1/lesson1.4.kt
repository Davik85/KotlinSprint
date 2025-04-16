package org.example.Lesson1

fun main () {
    val length: Long = 40868600000 //расстояние, которое пролетел Гагарин пока был в космосе в миллиметрах;
    val age: Byte = 27 // возраст Гагарина на момент полета (целых лет);
    val partOfDay: Float = 0.075F //  какую часть дня Гагарин провел в космосе;
    val seconds: Short = 6480 // количество секунд которое Гагарин провел в космосе;
    val partOfYear: Double = 2.0547945205479453E-4 //  какую часть года Гагарин провел в космосе;
    val apogee: UInt = 327000u // апогей орбиты Гагарина в метрах.

    println("Distance in millimeters = $length")
    println("Age $age")
    println("Part of Day $partOfDay")
    println("Time in seconds $seconds")
    println("Part of year $partOfYear")
    println("The apogee of the orbit in meters = $apogee")
}