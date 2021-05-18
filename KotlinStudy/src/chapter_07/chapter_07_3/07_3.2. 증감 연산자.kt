package chapter_07.chapter_07_3

class Point2(var x: Int = 0, var y: Int = 10) {

    // 증감연산자 오버로딩
    operator fun dec() = Point2(--x, --y)

}

fun main() {
    var a = 10
    a--
    var point = Point2()
    --point // --연산자
    println("point = (${point.x}, ${point.y})")

}
/*
    결과 :
    point = (-1, 9)
 */