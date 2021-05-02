package chapter_06

fun main() {
    val myDamas = CarModel("Damas 2010", VanImpl("100마력"))
    val my350z = CarModel("350Z 2008", SportImpl("350마력"))

    myDamas.carInfo() //2. carInfo에 대한 다형성
    my350z.carInfo()

}
/*
    결과 :
    Damas 2010 은 짐을 적재하며 100마력 을 가집니다.
    350Z 2008 은 경주용에 사용되며 350마력 을 가집니다.
 */
interface Car {
    fun go(): String
}

class VanImpl(val power: String): Car {
    override fun go() = "은 짐을 적재하며 $power 을 가집니다."
}

class SportImpl(val power: String): Car {
    override fun go() = "은 경주용에 사용되며 $power 을 가집니다."
}

class CarModel(val model: String, impl: Car): Car by impl{
    fun carInfo() {
        println("$model ${go()}") // 1. 참조 없이 각 인터페이스 구현 클래스의 go()에 접근
    }
}
