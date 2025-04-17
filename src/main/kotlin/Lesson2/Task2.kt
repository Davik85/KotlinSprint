package org.example.Lesson2

fun main() {
    val totalPermEmployees = 50
    val totalIntern = 30
    val salaryPermEmployee = 30000
    val salaryIntern = 20000
    val totalSalaryPermEmployees = totalPermEmployees*salaryPermEmployee
    val totalSalary = (totalIntern * salaryIntern) + totalSalaryPermEmployees
    val avgSalary = totalSalary / (totalPermEmployees + totalIntern)

    println("The total salary of permanent employees - $totalSalaryPermEmployees")
    println("The total salary of all employees - $totalSalary")
    println("The average salary of all employees - $avgSalary")
}