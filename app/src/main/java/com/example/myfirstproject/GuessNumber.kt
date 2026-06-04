package com.example.myfirstproject

import kotlin.random.Random

fun main() {
    val numberGuess = Random.nextInt(100)
    var win = false

    while (!win) {
        val number = readln().toInt()

        if (number < numberGuess) {
            println("Загаданное число больше")
        } else if (number > numberGuess) {
            println("Загаданное число меньше")
        } else {
            win = true
            println("Поздравляю, вы угадали!")
        }
    }
}