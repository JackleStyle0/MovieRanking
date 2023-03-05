package com.example.movieranking.kotlin._5_collection_loop

fun main() {

    val nameLists = listOf("Mary", "Anna", "Jane")
    val nameWithTitleLists = nameLists.map {
        "Miss.$it"
    }

    println(nameWithTitleLists)

    println(nameLists.any { it == "Mary" })

    val personList = mapOf(
        "Mary" to 18,
        "Anna" to 20,
        "Jane" to 20
    )

    println(personList.all { it.value >= 18 })

    println(personList.filter { it.value > 18 })
}