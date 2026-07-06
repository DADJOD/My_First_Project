package com.example.myfirstproject

fun main() {
    val names = listOf("John", "Nick", "Sara", "Jack", "Bob")
    println("Enter name: ")
    val searchName = readln()
    var nameFound = false

//    var index = 0
//    while (index < names.size) {
//        val name = names[index]
//        println(name)
//        if (searchName == name) {
//            nameFound = true
//            break
//        }
//        index++
//    }
    for (name in names) {
        println(name)
        if (name == searchName) {
            nameFound == true
            break
        }
    }
    println("Name found: $nameFound")
}