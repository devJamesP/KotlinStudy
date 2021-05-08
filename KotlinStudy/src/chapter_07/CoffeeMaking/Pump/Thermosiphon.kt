package chapter_07.CoffeeMaking.Pump

import chapter_07.CoffeeMaking.Heater.Heater

class Thermosiphon(heater: Heater) : Pump, Heater by heater {
    override fun pump() {
        if (isHot()) {
            println("[Thermosiphon] pumping...")
        }
    }
}