package org.example.Lesson2

import kotlin.math.pow

fun main() {
    val initialDeposit = 70000
    val interestRate = 16.7
    val rateDecimal = interestRate / 100
    val years = 20
    //Формула расчёта сложных процентов по вкладам: X = Y × (1 + P/D)D, где:
    //X — итоговая сумма вклада вместе с полученными процентами;
    //Y — изначальная сумма депозита;
    //P — процентная ставка в десятичном виде (делённая на 100);
    //D — количество периодов начисления процентов.
    // Возводим в степень при помощи .pow
    val finalAmount = initialDeposit * (1.0 + rateDecimal).pow(years)

    println("The amount of the deposit after $years years: ${"%,.3f".format(finalAmount)} rub")
}