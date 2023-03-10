package com.example.movieranking.kotlin._4_type_check_and_casts

fun main() {
    val x: Any = "Hello World"
    if (x is String) {
        print(x.length) // x is automatically cast to String
    }

    if (x !is String) return

    print(x.length) // x is automatically cast to String
}