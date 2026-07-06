package com.example.myfirstproject

fun main() {
    val number = 0..1000 step 2
    val findNumber = readln().toInt()
    if (findNumber in number) {
        println("Число число чётное")
    } else {
        println("Число не чётное")
    }
}