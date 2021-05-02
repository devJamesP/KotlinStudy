package chapter_06

fun main() {
    val kim = FakeAge()
    kim.age = 15
    println("Kim`s real age = 15, pretended age = ${kim.age}")

    val hong = FakeAge()
    hong.age = 35
    println("Hong`s real age = 35, pretended age = ${hong.age}")
}

/*
    결과 :
    Kim`s real age = 15, pretended age = 18
    Hong`s real age = 35, pretended age = 32
 */


class FakeAge {
    var age: Int = 0
    set(value) { // 나이에 따라 판별하는 세터
        field = when {
            value < 18 -> 18
            value in 18..30 -> value
            else -> value - 3
        }
     }
}