package org.example.Lesson3

fun main() {
    var from = "E2"
    var to = "E4"
    var moveNumber = 1

    val moveString = "[$from - $to; $moveNumber]"

    println("The first move $moveString")

    from = "D2"
    to = "D3"
    moveNumber = 2

    println("The second move [$from - $to; $moveNumber]")
}