package org.example.lesson_2

fun main() {
    val crystallineOre = 7
    val ironOre = 11

    val buffToMinedMaterials = 0.2

    val buffToCrystallineOre = crystallineOre * buffToMinedMaterials
    val buffToIronOre = ironOre * buffToMinedMaterials

    val formattedCrystallineOre = buffToCrystallineOre.toInt()
    val formattedIronOre = buffToIronOre.toInt()

    println("Количество бонусной кристаллической руды: $formattedCrystallineOre")
    println("Количество бонусной железной руды: $formattedIronOre")
}