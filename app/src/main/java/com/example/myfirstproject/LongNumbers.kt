package com.example.myfirstproject

fun main() {
//    val numbers = 0..1_000_000_000L
//    var sum = 0L
//    for (number in numbers) {
//        sum += number
//    }
//    println(sum)

    println("Write your age: ")
    val age = readln().toLong()
    println("Your age in seconds: " + age * 365 * 24 * 60 * 60)
}