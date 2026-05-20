package com.example.myfirstproject

fun main() {
    println("Сумма денег в твоем кармане? ")
    val money = readln().toInt()
    println("Голоден ли ты? true/false: ")
    val isHangry = readln().toBoolean()
    val isReach = money > 500
    if (isHangry && isReach) {
        println("Купите пиццу")
    } else if (isHangry && !isReach) {
        println("Купите доширак")
    } else if (!isHangry && isReach) {
        println("Сходите в кино")
    } else {
        println("Сходите на прогулку")
    }
}