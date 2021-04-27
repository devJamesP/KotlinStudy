package chapter_05

/**
 * Car 클래스 ::
 * 프로퍼티

 * - 연식
 * ~ 핸들
 * + 모델 이름
 * # 시동()
 *
 * 운전자 클래스
 * - 이름
 * - 나이
 * ~ 운전하다()
 * + 도어열기()
 *
 * 도둑 클래스 (외부 클래스)
 */

open class TestCar protected constructor(_year: Int, _model: String, _power: String, _wheel: String) {
    // 1.
    private val year: Int = _year
    val model = _model
    protected open val power: String = _power
    internal var wheel: String = _wheel

    protected fun start(key: Boolean) {
        if (key) println("Start the Engine!")
    }

    class TestDriver(_name: String, _licence: String) {
        // 2.
        private var name: String = _name
        var license: String = _licence
        internal fun driving() = println("[Driver] Driving() - $name")
    }
}

class Tico(_year: Int, _model: String, _power: String, _wheel: String, var name: String,
            private var key: Boolean): TestCar(_year, _model, _power, _wheel) {

    override var power: String = "50hp"
    val driver = TestDriver(name, "first class")

    constructor(_name: String, _key: Boolean ) : this(2014, "basic", "100hp",
    "normal", _name, _key) {
        name = _name
        key = _key
    }

    fun access(password: String) {
        if (password == "gotico") {
            println("----[Tico] access( )--------")
            // super.year // 3. private 접근 불가
            println("super.model = ${super.model}") // public
            println("super.power = ${super.power}") // protected
            println("super.wheel = ${super.wheel}") // internal
            super.start(key) // protected

            // driver.name // private 접근 불가
            println("Driver().license = ${driver.license}") // public
            driver.driving() // internal
        } else {
            println("You`re a burglar")
        }
    }
}
class Burglar() {
    fun steal(anycar: Any) {
        if (anycar is Tico) { // 4. 인자가 Tico 객체일 때
            println("----[Burglar] steal()--------")
            // println(anycar.power) // protected 접근 불가
            // println(anycar.year) // private 접근 불가
            println("anycar.name = ${anycar.name}") // public 접근
            println("anycar.wheel = ${anycar.wheel}") // internal 접근(같은 모듈 안에 있으므로)
            println("anycar.model = ${anycar.model}") // public 접근

            println(anycar.driver.license) // public 접근
            anycar.driver.driving() // internal 접근(같은 모듈 안에 있으므로)
            // println(Car.start()) // protected 접근 불가
            anycar.access("dontknow")
        } else {
            println("Nothing to steal")
        }
    }
}

fun main() {
    // val car = TestCar()
    val tico = Tico("kildong", true)
    tico.access("gotico")

    val burglar = Burglar()
    burglar.steal(tico)
}
/*
    결과 :
    ----[Tico] access( )--------
    super.model = basic
    super.power = 100hp
    super.wheel = normal
    Start the Engine!
    Driver().license = first class
    [Driver] Driving() - kildong
    ----[Burglar] steal()--------
    anycar.name = kildong
    anycar.wheel = normal
    anycar.model = basic
    first class
    [Driver] Driving() - kildong
    You`re a burglar
 */