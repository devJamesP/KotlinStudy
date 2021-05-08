package chapter_07.CoffeeMaking.CoffeMake

import chapter_07.CoffeeMaking.Brewing.CoffeeModule
import chapter_07.CoffeeMaking.Brewing.MyDripCoffeeModule
import chapter_07.CoffeeMaking.Pump.Thermosiphon

class CoffeeMaker(val coffeeModule: CoffeeModule) {
    fun brew() {
        val theSiphon: Thermosiphon = coffeeModule.getThermosiphon()
        theSiphon.on()
        theSiphon.pump()
        println("Coffee, here! Enjoy!~")
        theSiphon.off()
    }
}

fun main() {
    val coffeeMaker = CoffeeMaker(MyDripCoffeeModule())
    coffeeMaker.brew()
}
/*
    결과 :
    [ElectricHeater] heating...
    [Thermosiphon] pumping...
    Coffee, here! Enjoy!~
 */