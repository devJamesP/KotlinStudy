package chapter_07.chapter_07_2

interface Switcher { // 1. 인터페이스 선언
    fun on(): String
}

class Smartphone3(val model: String) {
    private val cpu = "Exynos"

    inner class ExternalStorage(val size: Int) {
        fun getInfo() = "${model}: Installed on $cpu with ${size}Gb"
    }

    fun powerOn(): String {
        class Led(val color: String) {
            fun blink(): String = "Blinking $color on $model"
        }
        val powerStatus = Led("Red")
        val powerSwitcher = object: Switcher { // 2. 익명 객체를 사용해 Switcher의 on()을 구현
            override fun on(): String {
                return powerStatus.blink()
            }
        }
        return powerSwitcher.on()
    }
}
/*
    결과 :
    Blinking Red on Note9
 */