package com.example.myfirstproject

fun main() {
    val firstAge = readln().toInt()
    val secondAge = readln().toInt()

    if (firstAge > secondAge) {
        println("The first person is older than second")
    } else if (firstAge < secondAge) {
        println("The second person is older than first")
    } else {
        println("The ages are equal")
    }
}