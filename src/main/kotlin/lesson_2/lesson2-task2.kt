package org.example.lesson_2

fun main() {
    val numberOfEmloyees = 50
    val employeesSalaries = 30000

    val numberOfInterns = 30
    val internsSalaries = 20000

    val employeeSalary = numberOfEmloyees * employeesSalaries
    val internSalary = numberOfInterns * internsSalaries
    println(employeeSalary)

    val salaryExpenses = employeeSalary + internSalary
    println(salaryExpenses)

    val averageSalary = salaryExpenses / 80
    println(averageSalary)
}