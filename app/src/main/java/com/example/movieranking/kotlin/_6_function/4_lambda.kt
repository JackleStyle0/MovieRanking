package com.example.movieranking.kotlin._6_function

fun main() {
    val isEvenNumber: (Int) -> Boolean = { value: Int ->
        value % 2 == 0
    }
    println(isEvenNumber(10))
}