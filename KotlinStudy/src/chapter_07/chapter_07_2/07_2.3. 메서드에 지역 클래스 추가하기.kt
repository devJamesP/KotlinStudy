package chapter_07.chapter_07_2

class Smartphone2(val model: String) {
    private val cpu = "Exynos"

    inner class ExternalStorage(val size: Int) {
        fun getInfo() = "${model}: Installed on $cpu with ${size}Gb"
    }

    fun powerOn(): String {
        class Led(val color: String) { // 지역 클래스 선언
            fun blink(): String = "Blinking $color on $model" // 외부의 프로퍼티는 접근 가능
        }
        val powerStatus = Led("Red") // 여기서 지역 클래스가 사용됨
        return powerStatus.blink()
    } // powerOn() 블록 끝
}

fun main() {
    val myPhone = Smartphone2("Note9")
    myPhone.ExternalStorage(128)
    println(myPhone.powerOn())
}
/*
    결과 :
    Blinking Red on Note9
 */