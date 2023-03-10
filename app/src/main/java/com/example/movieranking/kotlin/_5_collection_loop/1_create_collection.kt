package com.example.movieranking.kotlin._5_collection_loop

fun main() {

    val listOfInt = listOf<Int>()
    val listOfString = listOf("One", "Two", "Three")

    println(listOfString)

    val list = mutableListOf("One", "Two", "Three")
    list.remove("One")
    println(list)

}