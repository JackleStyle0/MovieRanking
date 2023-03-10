package com.example.movieranking.kotlin._4_type_check_and_casts

fun main() {

    val obj: Any = "Hello World"

    if (obj is String) {
        print(obj.length)
    }

    if (obj !is String) {
        print("Not a String")
    } else {
        print(obj.length)
    }

}