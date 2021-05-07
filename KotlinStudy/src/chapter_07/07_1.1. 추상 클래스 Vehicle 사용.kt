package chapter_07

fun main() {
    val car = Car("SuperMatiz", "yellow", 1110.0, 270.0)
    val motor = Motorcycle("DreamBike", "red", 170.0, 100.0)

    car.year = "2013"

    car.displaySpecs()
    car.start()

    motor.displaySpecs()
    motor.start()
}

/*
    결과 :
    name: SuperMatiz, color: yellow, weight: 1110.0, maxSpeed: 270.0
    Car Started
    name: DreamBike, color: red, weight: 170.0, maxSpeed: 100.0
    Bike Started
 */



// 추상 클래스, 주 생성자에는 비추상 프로퍼티 선언의 매개변수 3개가 있음.
abstract class Vehicle(val name: String, val color: String, val weight: Double) {

    // 추상 프로퍼티(반드시 하위 클래스에서 재정의해 초기화해야 함)
    abstract var maxSpeed: Double

    // 일반 프로퍼티(초깃값인 상태를 저장할 수 있음)
    var year = "2018"

    // 추상 메서드(반드시 하위 클래스에서 구현해야 함)
    abstract fun start()
    abstract fun stop()

    // 일반 메서드
    fun displaySpecs() {
        println("Name: $name, Color: $color, Weight: $weight, Year: $year, Max Speed: $maxSpeed")
    }
}

class Car(
    name: String,
    color: String,
    weight: Double,
    override var maxSpeed: Double // maxSpeed는 오버라이딩
) : Vehicle(name, color, weight) {
    override fun start() {
        // 코드 구현
        println("Car Started")
    }

    override fun stop() {
        // 코드 구현
        println("Car Stopped")
    }
}

class Motorcycle(
    name: String,
    color: String,
    weight: Double,
    override var maxSpeed: Double
) : Vehicle(name, color, weight) {
    override fun start() {
        // 코드 구현
        println("Bike Started")
    }

    override fun stop() {
        // 코드 구현
        println("Bike Stopped")
    }
}