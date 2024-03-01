package com.example.myapplication.lab3

class Aquarium1(length: Int = 100, width: Int = 20, height: Int = 40) {
    var length: Int = length
    var width: Int = width
    var height: Int = height
    val volume: Int
        get() = width * height * length / 1000
    var volume1: Int
        get() = width * height * length / 1000
        private set(value) {
            height = (value * 1000) / (width * length)
        }
    fun printSize(){
        println("Width: $width cm " +
                "Length: $length cm "+
                "Height: $height cm")
        println("Volume: $volume liters")
    }
    init {
       println("aquarium initializing")
    }
  //  init {
   //     println("Volume: ${width * length * height / 1000} liters")
   // }
    constructor(numberOfFish: Int) : this(){
        var tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }
}