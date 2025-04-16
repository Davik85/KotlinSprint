package org.example.Lesson1

fun main () {
    val totalSeconds:Int = 6480 // Общее время в секундах
    val hours = totalSeconds / 3600 // получаем часы
    val remainingSeconds = totalSeconds % 3600 //остаток секунд
    val minutes = remainingSeconds / 60 //получаем минуты
    val seconds = remainingSeconds % 60 //получаем секунды

    //форматируем в формат времени
    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    println("Time spent in space $formattedTime")
}