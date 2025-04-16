const val SECONDS_IN_MINUTE = 60
fun main() {
    val totalSeconds: Int = 6480
    val secondsInHour = SECONDS_IN_MINUTE * SECONDS_IN_MINUTE
    val hours = totalSeconds / secondsInHour
    val remainingSeconds = totalSeconds % secondsInHour
    val minutes = remainingSeconds / SECONDS_IN_MINUTE
    val seconds = remainingSeconds % SECONDS_IN_MINUTE

    println("Time spent in space %02d:%02d:%02d".format(hours, minutes, seconds))
}