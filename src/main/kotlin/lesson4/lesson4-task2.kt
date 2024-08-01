package org.example.lesson4

fun main() {
    val cargo1Weight = 20
    val cargo1Capacity = 80
    val cargo2Weight = 50
    val cargo2Capacity = 100

    val averageWeightMinimum = 35
    val averageWeightMax = 100
    val averageCapacity = 100

    println("Груз с весом $cargo1Weight кг и объемом $cargo1Capacity л соответствует категории 'Average': " +
            "${((cargo1Weight > averageWeightMinimum) && 
                    (cargo1Weight <= averageWeightMax)) and 
                    (cargo1Capacity < averageCapacity)}")
    println("Груз с весом $cargo2Weight кг и объемом $cargo2Capacity л соответствует категории 'Average': " +
            "${((cargo2Weight > averageWeightMinimum) && 
                    (cargo2Weight <= averageWeightMax)) and 
                    (cargo2Capacity < averageCapacity)}")
}