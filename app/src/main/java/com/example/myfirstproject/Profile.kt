package com.example.myfirstproject

fun main() {
    val inputFirstName = "Input your name: "
    val inputAge = "Input your age "
    val inputLastName = "Input your last name "

    print(inputFirstName)
    val firstName = readln()
    print(inputLastName)
    val lastName = readln()
    print(inputAge)
    val age = readln()

    println("First name: $firstName \nLast name: $lastName \nAge: $age")
}