package com.example.movieranking.kotlin._4_type_check_and_casts

fun main() {
    val x: Any = "Hello World"

    when (x) {
        is Int -> print(x + 1)
        is String -> print(x.length + 1)
        is IntArray -> print(x.sum())
    }
}