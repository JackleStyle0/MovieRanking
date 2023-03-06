package com.example.movieranking.kotlin._6_function

fun main() {
   println("Anne".lastChar())
}

fun String.lastChar() = this.get(this.lastIndex)