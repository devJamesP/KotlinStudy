package chapter_07.chapter_07_3

class Point8(var x: Int = 0, var y: Int = 10) {
}

fun main() {
    val point = Point()

    val a = 10

    // a와 10을 비교한 결과 출력 true
    println(a == point.y)

    // 같은식
    var result: Int? = null
    println(a?.equals(point.y))

}
/*
    결과 :
    true
    true
 */