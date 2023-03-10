package com.example.movieranking.kotlin._4_type_check_and_casts

fun main() {
    val y: Any = "Hello World"
    val x: String = y as String

    println(x.length)
}