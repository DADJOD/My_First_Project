package com.example.myfirstproject

fun main() {
    println("Enter your password: ")
    val password = readln().toCharArray()

//    for (char in password) {
//        if (char in 'a'..'z' ||
//            char in 'A'..'Z' ||
//            char in '0'..'9' ||
//            char in '!'..'/' ||
//            password.size >= 8) {
//            println("Your password is correct")
//            break
//        } else {
//            println("Your password is incorrect")
//        }
//    }

//    for (char in password) {
//        if (
//            (password.size >= 8) &&
//            (char in ('a'..'z')) ||
//            (char in ('A'..'Z')) ||
//            (char in ('0'..'9')) ||
//            (char in ('!'..'/'))
//        ) {
//            println("char is correct")
//            break
//        } else {
//            println("char is incorrect")
//        }
//    }

    var containsLetter = false
    var containsDigit = false
    var containsSpecialChar = false
    for (char in password) {
        if (char.isLetter()) {
            containsLetter = true
        }
        if (char.isDigit()) {
            containsDigit = true
        }
        if (!char.isLetterOrDigit()) {
            containsSpecialChar = true
        }
    }
    if (containsLetter && containsDigit && containsSpecialChar && password.size >= 8) {
        println("Your password is correct")
    } else {
        println("Your password is incorrect")
    }
}
