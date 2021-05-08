package chapter_07.CoffeeMaking.Brewing

import chapter_07.CoffeeMaking.Pump.Thermosiphon

interface CoffeeModule {
    fun getThermosiphon() : Thermosiphon
}