package com.example.movieranking.kotlin._2_condition

fun main() {

    val numberOfFish = 50
    if (numberOfFish == 0) {
        println("Empty tank")
    } else if (numberOfFish < 40) {
        println("Got fish!")
    } else {
        println("That's a lot of fish!")
    }

    // That's a lot of fish!
}