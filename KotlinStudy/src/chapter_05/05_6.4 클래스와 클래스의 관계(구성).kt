package chapter_05

fun main() {
    val car = Car("Tico", "100hp")
    car.startEngine()
    car.stopEngine()
}
class Car(val name: String, val power: String) {
    private var engine = Engine(power) // Engine 클래스 객체는 Car에 의존적

    fun startEngine() = engine.start()
    fun stopEngine() = engine.stop()
}

class Engine(val power: String) {
    fun start() = println("Engine has been started.")
    fun stop() = println("Engine has been stopped.")
}