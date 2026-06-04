package com.example.myfirstproject

fun main() {
    var temperature = readln().toInt()
    var airConditionIsOn = false

    repeat(20) {
        if (temperature > 25) {
            airConditionIsOn = true
        } else if (temperature < 20) {
            airConditionIsOn = false
        }

        if (airConditionIsOn) {
            temperature -= 5
        } else {
            temperature += 5
        }

        println("Current temperature: $temperature")
    }
}