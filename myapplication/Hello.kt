package com.example.myapplication
import java.util.*
//fun feedTheFish() {
   // val day = randomDay()
    //val food = "pellets"
    //println ("Today is $day and the fish eat $food")
//}
fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)

    println ("Today is $day and the fish eat $food")
}
fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}
//fun fishFood (day : String) : String {
    //var food = ""
    //when (day) {
        //"Monday" -> food = "flakes"
        //"Tuesday" -> food = "pellets"
       // "Wednesday" -> food = "redworms"
        //"Thursday" -> food = "granules"
        //"Friday" -> food = "mosquitoes"
        //"Saturday" -> food = "lettuce"
        //"Sunday" -> food = "plankton"
   // }
   // return food
//}
fun fishFood (day : String) : String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}
fun main(args: Array<String>) {
    //println("Hello, world")
    feedTheFish()
}