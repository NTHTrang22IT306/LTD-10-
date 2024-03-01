package com.example.myapplication.lab3


fun buildAquarium(){
    var myAquarium = Aquarium()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()
}
fun buildAquarium1(){
   // var quarium1 = Aquarium1()
   // quarium1.printSize()
   // var quarium2 = Aquarium1(width = 25)
  //  quarium2.printSize()
  //  var quarium3 = Aquarium1(height = 35, length = 110)
  //  quarium3.printSize()
   // var aquarium4 = Aquarium1(width = 25, height = 35, length = 110)
  //  aquarium4.printSize()
   // var aquarium6 = Aquarium1(numberOfFish = 29)
   // aquarium6.printSize()
    //println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000} liters")
   // aquarium6.volume1 = 70
   // aquarium6.printSize()
}
fun buildAquarium3(){
    //val aquarium6 = Aquarium3(length = 25, width = 25, height = 40)
   // aquarium6.printSize()
    val myAquarium = Aquarium3(width = 25, length = 25, height = 40)
    myAquarium.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}
fun makeFish() {
    val shark = AquariumFish.Shark()
    val pleco = AquariumFish.Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}
fun main(){
    //buildAquarium()
    //buildAquarium1()
    //buildAquarium3()
    makeFish()
}