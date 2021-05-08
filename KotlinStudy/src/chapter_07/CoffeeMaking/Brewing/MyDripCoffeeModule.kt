package chapter_07.CoffeeMaking.Brewing

import chapter_07.CoffeeMaking.Heater.ElectricHeater
import chapter_07.CoffeeMaking.Pump.Thermosiphon

class MyDripCoffeeModule: CoffeeModule {
    companion object {
        val eletricHeater: ElectricHeater by lazy { // lazy를 이용한 지연 초기화
            ElectricHeater()
        }
    }
    private val _thermosiphon: Thermosiphon by lazy { // 임시적인 private 프로퍼티
        Thermosiphon(eletricHeater)
    }

    // 오직 이 메서드에서만 Thermosiphon을 초기화
    override fun getThermosiphon(): Thermosiphon = _thermosiphon
}