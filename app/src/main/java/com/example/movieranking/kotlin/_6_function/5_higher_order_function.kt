package com.example.movieranking.kotlin._6_function

fun main() {
    val numbers = listOf("1", "2", "3", "4", "5", "6", "7", "8")
    println(sum(numbers, ::mapToInt))
}

fun mapToInt(list: List<String>): List<Int> = list.map { it.toInt() }

fun sum(list: List<String>, map: (List<String>) -> List<Int>): Int = map(list).sum()
