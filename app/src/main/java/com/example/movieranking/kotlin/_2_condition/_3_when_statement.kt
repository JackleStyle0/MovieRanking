package com.example.movieranking.kotlin._2_condition

fun main() {
    val x = (1..5).random()
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> {
            print("x is neither 1 nor 2")
        }
    }
}