package com.example.myfirstproject

fun main() {
    val firstPeopleAge = readln().toInt()
    val secondPeopleAge = readln().toInt()
    val thirdPeopleAge = readln().toInt()

    val result = (firstPeopleAge + secondPeopleAge + thirdPeopleAge) / 3.0
    println(result)
}