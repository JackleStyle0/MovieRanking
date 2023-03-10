package com.example.movieranking.kotlin._3_nullability

fun main() {
    var fishFoodTreats: Int? = 6

    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats?.dec()
        println("fishFoodTreats: $fishFoodTreats")
    }

    fishFoodTreats = fishFoodTreats?.dec()
    fishFoodTreats = fishFoodTreats?.dec() ?: 0
}