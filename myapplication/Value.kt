package com.example.myapplication
fun main(arg: Array<String>){
    //val isUnit = println("This is an experession")
   // println(isUnit)
    //val temperature = 10
    //val isHot = if (temperature > 50) true else false
    //println(isHot)
    val temperature = 10
    val message = "The water temperature is ${if (temperature > 50) "too warm" else "OK"}."
    println(message)
}

