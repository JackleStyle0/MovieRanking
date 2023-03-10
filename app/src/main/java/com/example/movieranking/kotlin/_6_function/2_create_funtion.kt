package com.example.movieranking.kotlin._6_function

import java.util.Random

fun main() {
    printHello()
}

fun printHello(name: String = "World") {
     println("Hello $name")
}

fun randomDay(): String {
    val week = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return week[Random().nextInt(week.size)]
}
