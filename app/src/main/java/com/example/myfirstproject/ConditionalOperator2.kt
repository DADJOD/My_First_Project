package com.example.myfirstproject

fun main() {
    println("Write number of month: ")
    val chooseMonth = readln().toInt()
    val allMonthsIndex = 1..12

    val month = when (chooseMonth) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> ""
    }

    if (chooseMonth in allMonthsIndex) {
        println("Your index is $chooseMonth and month is $month")
    } else {
        println("Error")
    }
    
    println("Введите название месяца: ")
    val monthName = readln()

    val season = when (monthName) {
        "December", "January", "February" -> "Winter"
        "March", "April", "May" -> "Spring"
        "June", "July", "August" -> "Summer"
        "September", "October", "November" -> "Autumn"
        else -> ""
    }

    println("Время года: $season")
}

