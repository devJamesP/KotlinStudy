package chapter_07.chapter_07_3

class Point(var x: Int = 0, var y: Int = 10) {
    // plus() 함수의 연산자 오버로딩
    operator fun plus(p: Point) : Point {
        return Point(x + p.x, y + p.y)
    }
}

fun main() {
    val p1 = Point(3, -8)
    val p2 = Point(2, 9)

    var point = Point()
    point = p1 + p2 // Point 객체의 +  연산이 가능하게 됨.
    println("point = (${point.x}, ${point.y})")
}
/*
    결과 :
    point = (5, 1)
    point = (4, 0)
 */