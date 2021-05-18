package chapter_07.chapter_07_3

data class Point5(var x: Int, var y: Int)

// 단일 연산자 오버로딩
operator fun Point5.unaryMinus() = Point5(-x, -y)


fun main() {
    var point = Point5(10, 20)
    println(-point)
}
/*
    결과 :
    Point5(x=-10, y=-20)
 */