package org.example.lesson_2

const val ONE_HUNDRED_PERCENT = 100

fun main() {
    val crystallineOre = 7
    val ironOre = 11
    val buffToMinedMaterials = 20

    val buffToCrystallineOre = crystallineOre * buffToMinedMaterials / ONE_HUNDRED_PERCENT // Делим количество добытой руды на 100% руды
    val buffToIronOre = ironOre * buffToMinedMaterials / ONE_HUNDRED_PERCENT // Делим количество добытой руды на 100% руды

//    val formattedCrystallineOre = buffToCrystallineOre.toInt()
//    val formattedIronOre = buffToIronOre.toInt()

//    println("Количество бонусной кристаллической руды: $formattedCrystallineOre")
//    println("Количество бонусной железной руды: $formattedIronOre")

    println("Количество бонусной кристаллической руды: $buffToCrystallineOre")
    println("Количество бонусной железной руды: $buffToIronOre")
}