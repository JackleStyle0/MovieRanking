package com.example.movieranking.kotlin._2_condition

fun main() {

    val x = (1..30).random()
    when (x) {
        in 1..10 -> print("x is in the range")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }
}