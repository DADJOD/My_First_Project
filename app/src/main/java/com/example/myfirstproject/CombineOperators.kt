package com.example.myfirstproject

fun main() {
    println("The weather is good? true/false: ")
    val isGoodWeather = readln().toBoolean()
    println("What time is it? 0 until 24")
    val time = readln().toInt()
    val isDay = time < 22 && time > 5
    if (isDay && isGoodWeather) {
        println("Go for a walk")
    } else if (isDay && !isGoodWeather) {
        println("Go to read book")
    } else {
        println("Go to sleep")
    }
}