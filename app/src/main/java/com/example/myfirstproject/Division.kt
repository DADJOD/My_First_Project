package com.example.myfirstproject

fun main() {
    val seconds = readln().toInt()
    val hours = seconds / 3600
    val minutes = (seconds / 60) % 60
    val leftSeconds = seconds % 60

    println("$hours : $minutes : $leftSeconds")
}