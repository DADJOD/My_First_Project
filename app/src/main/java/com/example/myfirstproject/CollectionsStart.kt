package com.example.myfirstproject

fun main() {
    val family = listOf<String>("John", "Nick", "Sara", "Jack", "Bob")
    val person = family[0]
    println(person)


    val countOfLastDaysMonth = listOf<Int>(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    val countOfMonth = readln().toInt()
    if (countOfMonth < 1 || countOfMonth > 12) {
        println("Ошибка ввода")
    } else {
        println(countOfLastDaysMonth[countOfMonth - 1])
    }
}