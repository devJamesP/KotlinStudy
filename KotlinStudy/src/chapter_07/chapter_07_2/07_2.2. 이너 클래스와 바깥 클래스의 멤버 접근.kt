package chapter_07.chapter_07_2

class Smartphone(val model: String) {
    private val cpu = "Exynos"


    inner class ExternalStorage(val size: Int) {
        val test = "test"
        fun getInfo(): String = "${model}: Installed on $cpu with ${size}Gb" // 바깥 클래스의 프로퍼티 접근
    }
}

fun main() {
    val mySdcard = Smartphone("S7").ExternalStorage(32)
    println(mySdcard.getInfo())
}
/*
    결과 :
    S7: Installed on Exynos with 32Gb

 */