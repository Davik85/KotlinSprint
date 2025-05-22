package org.example.Lesson11

data class RecipeCategory(
    val id: String,
    val title: String,
    val imageUrl: String,
    val recipes: List<Recipe>
)

data class Recipe(
    val id: String,
    val title: String,
    val imageUrl: String,
    val categoryId: String,
    val durationMinutes: Int,
    val servings: Int,
    val ingredients: List<Ingredient>,
    val instructions: List<String>
)

data class Ingredient(
    val name: String,
    val quantity: Float,
    val unit: String
)
