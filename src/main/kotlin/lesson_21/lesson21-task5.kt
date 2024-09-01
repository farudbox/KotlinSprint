package org.example.lesson_21

fun Map<String, Int>.maxCategory(): String? {
    return this.maxByOrNull { it.value }?.key
}

fun main() {
    val skills = mapOf(
        "Archery" to 120,
        "Stealth" to 85,
        "Magic" to 150,
        "Swordsmanship" to 150
    )

    val maxSkill = skills.maxCategory()
    println(maxSkill)
}
