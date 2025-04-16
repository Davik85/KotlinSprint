package org.example.Lesson1

fun println(format: String, s: String) {

}

fun main() {
    val totalSeconds: Int = 6480
    val secondsInMinute: Int = 60
    val minutesInHour: Int = 60
    val secondsInHour = secondsInMinute * minutesInHour
    val hours = totalSeconds / secondsInHour
    val remainingSeconds = totalSeconds % secondsInHour
    val minutes = remainingSeconds / secondsInMinute
    val seconds = remainingSeconds % secondsInMinute

    println("Time spent in space %02d:%02d:%02d".format(hours, minutes, seconds))
}