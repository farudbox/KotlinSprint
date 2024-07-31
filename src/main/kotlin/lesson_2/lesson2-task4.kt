package org.example.lesson_2

const val ONE_HUNDRED_PERCENT = 100

fun main() {
    val crystallineOre = 7
    val ironOre = 11
    val buffToMinedMaterials = 20

    val buffToCrystallineOre = crystallineOre * buffToMinedMaterials / ONE_HUNDRED_PERCENT
    val buffToIronOre = ironOre * buffToMinedMaterials / ONE_HUNDRED_PERCENT

    println("Количество бонусной кристаллической руды: $buffToCrystallineOre")
    println("Количество бонусной железной руды: $buffToIronOre")
}