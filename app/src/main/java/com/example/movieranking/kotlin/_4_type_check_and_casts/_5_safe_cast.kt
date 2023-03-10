package com.example.movieranking.kotlin._4_type_check_and_casts

fun main() {
    val y: Any = 0
    val z: String? = y as? String

    println(z?.length)
}