package com.example.movieranking.kotlin._2_condition

fun main() {

    val fish = 50
    // fish >= 1 && fish <= 100
    if (fish in 1..100) {
        println(fish)
    }

    // ⇒ 50
}