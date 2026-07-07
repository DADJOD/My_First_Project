package com.example.myfirstproject

fun main() {
//    println("Введите первое число:")
//    val firstNumber = readln().toInt()
//    println("Введите второе число:")
//    val secondNumber = readln().toInt()
//    println("Введите оператор (+, -, *, /):")
//    val symbol = readln()
//
//    val result =
//        if (symbol == "+") {
//            firstNumber + secondNumber
//        } else if (symbol == "-") {
//            firstNumber - secondNumber
//        } else if (symbol == "*") {
//            firstNumber * secondNumber
//        } else if (symbol == "/") {
//            if (secondNumber != 0) {
//                firstNumber / secondNumber.toDouble()
//            } else {
//                "Ошибка: на ноль делить нельзя!"
//            }
//        } else {
//            "Неизвестный оператор"
//        }
//
//    println("Результат: $result")

    print("Введите задачу для решения: ")
    val task = readln()

    val parts = task.split(" ")

    val firstNumber = parts[0].toDouble()
    val secondNumber = parts[2].toDouble()
    val symbol = parts[1]

    val result =
        if (symbol == "+") {
            firstNumber + secondNumber
        } else if (symbol == "-") {
            firstNumber - secondNumber
        } else if (symbol == "*") {
            firstNumber * secondNumber
        } else if (symbol == "/") {
            if (secondNumber != 0.0) {
                firstNumber / secondNumber.toDouble()
            } else {
                "Ошибка: на ноль делить нельзя!"
            }
        } else {
            "Неизвестный оператор"
        }

    println("Результат: $result")
}