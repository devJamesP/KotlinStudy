package chapter_07

fun main() {
    val myPrinter = object: Printer() {
        override fun print() {
            println("출력합니다.")
        }
    }

    myPrinter.print()
}
/*
    결과 :
    출력합니다.
 */

abstract class Printer {
    abstract fun print() // 추상 메서드
}

