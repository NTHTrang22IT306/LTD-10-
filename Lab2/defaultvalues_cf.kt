package com.example.myapplication

fun swim(speed: String = "fast") {
    println("swimming $speed")
}
fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" ->  true
        else -> false
    }
}
fun shouldChangeWater1 (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else  -> false
    }
}
fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"
fun feedTheFish1() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
    //println("Change water: ${shouldChangeWater(day)}")
    println("Change water: ${shouldChangeWater1(day)}")
}
fun main(arg: Array<String>){
    //swim()
    //swim("slow")
    //swim(speed="turtle-like")
    feedTheFish1()
}