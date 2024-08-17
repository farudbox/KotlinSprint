package org.example.lesson_11

data class RecipeCategory (
    val id: Int,
    val name: String,
    val imageUrl: String,
)

data class Recipe (
    val id: Int,
    val title: String,
    val imageUrl: String,
    val ingredients: List<Ingredient>,
    val instructions: List<String>,
    val category: RecipeCategory,
)

data class Ingredient(
    val name: String,
    val quantity: Int,
    val unit: String,
)