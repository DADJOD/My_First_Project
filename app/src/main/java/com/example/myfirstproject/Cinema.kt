package com.example.myfirstproject

fun main() {
    var countUser = readln().toInt()
    
    repeat(18 - countUser) {
        println("Еще нет 18. Подождите 1")
    }
    println("Поехали!")

    while (countUser < 18) {
        println("Еще нет 18. Подождите 2")
        countUser++
    }
    println("Поехали!")
}