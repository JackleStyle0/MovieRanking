package com.example.movieranking.kotlin._7_class_and_object

fun main() {
    val cat = Cat("Mew", "Men", 3)
    val cat1 = Cat("Mew", "Men", 3)


    // Destructor
    val (name, gender, age) = cat
    val cat2 = cat.copy(name = "Mew2")
}

data class Cat(val name: String, val gender: String, val age: Int) {

    fun eat(food: String) {

    }

    fun sleep(hour: Int) {

    }
}