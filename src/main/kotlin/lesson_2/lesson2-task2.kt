package org.example.lesson_2

fun main() {
    val numberOfEmployees = 50
    val employeesSalaries = 30000

    val numberOfInterns = 30
    val internsSalaries = 20000

    val totalNumberOfEmployees = numberOfInterns + numberOfEmployees

    val employeeSalary = numberOfEmployees * employeesSalaries
    val internSalary = numberOfInterns * internsSalaries
    println(employeeSalary)

    val salaryExpenses = employeeSalary + internSalary
    println(salaryExpenses)

    val averageSalary = salaryExpenses / totalNumberOfEmployees
    println(averageSalary)
}