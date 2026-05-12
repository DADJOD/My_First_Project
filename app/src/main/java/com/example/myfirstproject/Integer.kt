package com.example.myfirstproject

fun main() {
    print("How many apples does John have? ")
    val john = readln().toInt()
    val nick = john + 7
    val sum = john + nick
    println("John and Nick have $sum apples")

    val mike = readln().toInt()
    println("Result ${john * mike}")
}