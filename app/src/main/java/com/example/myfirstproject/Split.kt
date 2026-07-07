package com.example.myfirstproject

fun main() {
    val daysOfWeekAsString = "Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday"
    val daysOfWeek = daysOfWeekAsString.split(", ")
    for (day in daysOfWeek) {
        println(day)
    }
}