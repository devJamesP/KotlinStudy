package chapter_07.chapter_07_3

class Point9(var x: Int = 0, var y: Int = 10) {
}

fun main() {
    val point = Point9()

    val a = 10
    // y와 a가 같으므로 false
    println(a < point.y)

    // 같은식
    println(a.compareTo(point.y))
}
/*
    결과 :
    false
    false
 */