package com.example.movieranking.kotlin._5_collection_loop

fun main() {

    val listOfString = listOf("One", "Two", "Three")
    for (element in listOfString) {
        println(element)
    }

    for ((index, element) in listOfString.withIndex()) {
        println("$index = $element")
    }

    var bubbles = 0
    while (bubbles < 10) {
        bubbles++
    }

    println("$bubbles bubbles in the water")
}